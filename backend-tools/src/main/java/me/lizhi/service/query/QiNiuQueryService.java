package me.lizhi.service.query;

import me.lizhi.domain.QiniuContent;
import me.lizhi.repository.QiniuContentRepository;
import me.lizhi.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
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
@CacheConfig(cacheNames = "qiNiu")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class QiNiuQueryService {

    @Autowired
    private QiniuContentRepository qiniuContentRepository;

    /**
     * 分页
     */
    @Cacheable(keyGenerator = "keyGenerator")
    public Object queryAll(QiniuContent qiniuContent, Pageable pageable){
        return PageUtil.toPage(qiniuContentRepository.findAll(new Spec(qiniuContent),pageable));
    }

    class Spec implements Specification<QiniuContent> {

        private QiniuContent qiniuContent;

        public Spec(QiniuContent qiniuContent){
            this.qiniuContent = qiniuContent;
        }

        @Override
        public Predicate toPredicate(Root<QiniuContent> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {

            List<Predicate> list = new ArrayList<Predicate>();

            if(!ObjectUtils.isEmpty(qiniuContent.getKey())){
                /**
                 * 模糊
                 */
                list.add(cb.like(root.get("key").as(String.class),"%"+qiniuContent.getKey()+"%"));
            }

            Predicate[] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        }
    }
}
