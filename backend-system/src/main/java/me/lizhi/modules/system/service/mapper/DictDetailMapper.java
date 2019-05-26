package me.lizhi.modules.system.service.mapper;

import me.lizhi.mapper.EntityMapper;
import me.lizhi.modules.system.domain.DictDetail;
import me.lizhi.modules.system.service.dto.DictDetailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author jie
* @date 2019-04-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictDetailMapper extends EntityMapper<DictDetailDTO, DictDetail> {

}