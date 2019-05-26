package me.lizhi.modules.system.service.query;

import me.lizhi.utils.PageUtil;
import me.lizhi.modules.system.domain.Dict;
import me.lizhi.modules.system.service.dto.DictDTO;
import me.lizhi.modules.system.repository.DictRepository;
import me.lizhi.modules.system.service.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
@CacheConfig(cacheNames = "dict")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DictQueryService {

    @Autowired
    private DictRepository dictRepository;

    @Autowired
    private DictMapper dictMapper;

    /**
     * 分页
     */
    @Cacheable(keyGenerator = "keyGenerator")
    public Object queryAll(DictDTO dict, Pageable pageable){
        Page<Dict> page = dictRepository.findAll(new Spec(dict),pageable);
        return PageUtil.toPage(page.map(dictMapper::toDto));
    }

    /**
    * 不分页
    */
    @Cacheable(keyGenerator = "keyGenerator")
    public Object queryAll(DictDTO dict){
        return dictMapper.toDto(dictRepository.findAll(new Spec(dict)));
    }

    class Spec implements Specification<Dict> {

        private DictDTO dict;

        public Spec(DictDTO dict){
            this.dict = dict;
        }

        @Override
        public Predicate toPredicate(Root<Dict> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {

            List<Predicate> list = new ArrayList<Predicate>();

            if(!ObjectUtils.isEmpty(dict.getName())){
                /**
                * 模糊
                */
                list.add(cb.like(root.get("name").as(String.class),"%"+dict.getName()+"%"));
            }
            if(!ObjectUtils.isEmpty(dict.getRemark())){
                /**
                * 模糊
                */
                list.add(cb.like(root.get("remark").as(String.class),"%"+dict.getRemark()+"%"));
            }
            Predicate[] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        }
    }
}