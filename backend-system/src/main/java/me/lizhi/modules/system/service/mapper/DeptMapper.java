package me.lizhi.modules.system.service.mapper;

import me.lizhi.mapper.EntityMapper;
import me.lizhi.modules.system.domain.Dept;
import me.lizhi.modules.system.service.dto.DeptDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 *
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptMapper extends EntityMapper<DeptDTO, Dept> {

}