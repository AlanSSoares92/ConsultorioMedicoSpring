package com.premier.consultorio.adapters.mapper;


import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import com.premier.consultorio.adapters.out.entity.Medicos;
import com.premier.consultorio.infrastructure.service.config.AppConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface MedicoMapper {
    MedicoDTO entityToDTO(Medicos entity);

    Medicos toEntity(MedicoDTO dto);

    List<MedicoDTO> toListDto(List<Medicos> medicosListEntity);

    List<Medicos> toListEntity(List<Medicos> listMedicos);
}
