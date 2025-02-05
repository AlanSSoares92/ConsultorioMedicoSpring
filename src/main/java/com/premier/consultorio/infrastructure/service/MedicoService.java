package com.premier.consultorio.infrastructure.service;

import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import com.premier.consultorio.adapters.out.entity.Medicos;
import com.premier.consultorio.adapters.out.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository repository;

//    @Autowired
//    MedicoMapper mapper;
//
//    @Transactional
//    public void save(MedicoDTO medico){
//       mapper.entityToDTO(repository.save(mapper.toEntity(medico)));
//    }

    public void save(MedicoDTO medico){
        Medicos entity = new Medicos(medico);
        repository.save(entity);
    }
}
