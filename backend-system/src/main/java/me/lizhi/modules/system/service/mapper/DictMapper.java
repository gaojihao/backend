package me.lizhi.modules.system.service.mapper;

import me.lizhi.mapper.EntityMapper;
import me.lizhi.modules.system.domain.Dict;
import me.lizhi.modules.system.service.dto.DictDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author jie
* @date 2019-04-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictMapper extends EntityMapper<DictDTO, Dict> {

}