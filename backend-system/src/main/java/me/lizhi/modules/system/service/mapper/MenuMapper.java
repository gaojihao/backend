package me.lizhi.modules.system.service.mapper;

import me.lizhi.modules.system.domain.Menu;
import me.lizhi.mapper.EntityMapper;
import me.lizhi.modules.system.service.dto.MenuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author jie
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {

}
