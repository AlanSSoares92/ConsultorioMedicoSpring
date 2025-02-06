package com.premier.consultorio.adapters.in.controller;

import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import com.premier.consultorio.infrastructure.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoService service;

    @PostMapping
    @Transactional
    public ResponseEntity<MedicoDTO> salvar(@RequestBody MedicoDTO medicos){
        service.save(medicos);
        return new ResponseEntity<>(medicos, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Optional<MedicoDTO>> getAll(){
        Optional<MedicoDTO> dtoList = service.findAll();
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }
}
