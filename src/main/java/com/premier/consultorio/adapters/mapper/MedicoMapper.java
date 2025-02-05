package com.premier.consultorio.adapters.mapper;


import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import com.premier.consultorio.adapters.out.entity.Medicos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedicoMapper {

    @Mapping(target = "", source = "id", ignore = true)
    MedicoDTO entityToDTO(Medicos entity);
    Medicos toEntity(MedicoDTO dto);
    List<MedicoDTO> toListDto(List<Medicos> medicosListEntity);
}
