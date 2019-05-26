package me.lizhi.modules.system.service.mapper;

import me.lizhi.mapper.EntityMapper;
import me.lizhi.modules.system.domain.Role;
import me.lizhi.modules.system.service.dto.RoleDTO;
import me.lizhi.modules.system.service.dto.RoleSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 *
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleSmallMapper extends EntityMapper<RoleSmallDTO, Role> {

}
