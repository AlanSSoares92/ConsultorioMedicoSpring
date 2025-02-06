package com.premier.consultorio.infrastructure.service.config;

import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import com.premier.consultorio.adapters.mapper.MedicoMapper;
import com.premier.consultorio.adapters.out.entity.Medicos;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MapperConfig {

    @Bean
    public MedicoMapper medicoMapper() {
        return new MedicoMapper() {
            public MedicoDTO entityToDTO(Medicos entity) {
                return null;
            }

            public Medicos toEntity(MedicoDTO dto) {
                return null;
            }

            public List<MedicoDTO> toListDto(List<Medicos> medicosListEntity) {
                return null;
            }

            public List<Medicos> toListEntity(List<Medicos> listMedicos) {
                return null;
            }
        };
    }
}
