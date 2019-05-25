package me.lizhi.modules.system.service.mapper;

import me.lizhi.modules.system.domain.Permission;
import me.lizhi.mapper.EntityMapper;
import me.lizhi.modules.system.service.dto.PermissionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author jie
 * @date 2018-11-23
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {

}
