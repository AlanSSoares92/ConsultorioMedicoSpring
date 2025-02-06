package com.premier.consultorio.infrastructure.service;

import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import com.premier.consultorio.adapters.mapper.MedicoMapper;
import com.premier.consultorio.adapters.out.entity.Medicos;
import com.premier.consultorio.adapters.out.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository repository;

    @Autowired
    MedicoMapper mapper;

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
    public Optional<MedicoDTO> findAll(){
        List<Medicos> listMedicos = repository.findAll();
        Optional<MedicoDTO> dtoList = Optional.of(new MedicoDTO(listMedicos));
        return dtoList;
        };
}