package me.lizhi.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.lizhi.modules.system.domain.Dept;
import me.lizhi.modules.system.service.dto.DeptDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-29T23:42:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class DeptMapperImpl implements DeptMapper {

    @Override
    public Dept toEntity(DeptDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Dept dept = new Dept();

        dept.setId( dto.getId() );
        dept.setName( dto.getName() );
        dept.setEnabled( dto.getEnabled() );
        dept.setPid( dto.getPid() );
        dept.setCreateTime( dto.getCreateTime() );

        return dept;
    }

    @Override
    public DeptDTO toDto(Dept entity) {
        if ( entity == null ) {
            return null;
        }

        DeptDTO deptDTO = new DeptDTO();

        deptDTO.setId( entity.getId() );
        deptDTO.setName( entity.getName() );
        deptDTO.setEnabled( entity.getEnabled() );
        deptDTO.setPid( entity.getPid() );
        deptDTO.setCreateTime( entity.getCreateTime() );

        return deptDTO;
    }

    @Override
    public List<Dept> toEntity(List<DeptDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Dept> list = new ArrayList<Dept>( dtoList.size() );
        for ( DeptDTO deptDTO : dtoList ) {
            list.add( toEntity( deptDTO ) );
        }

        return list;
    }

    @Override
    public List<DeptDTO> toDto(List<Dept> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DeptDTO> list = new ArrayList<DeptDTO>( entityList.size() );
        for ( Dept dept : entityList ) {
            list.add( toDto( dept ) );
        }

        return list;
    }
}
