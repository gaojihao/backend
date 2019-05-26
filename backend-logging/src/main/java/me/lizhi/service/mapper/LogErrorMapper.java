package me.lizhi.service.mapper;

import me.lizhi.domain.Log;
import me.lizhi.mapper.EntityMapper;
import me.lizhi.service.dto.LogErrorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogErrorMapper extends EntityMapper<LogErrorDTO, Log> {

}