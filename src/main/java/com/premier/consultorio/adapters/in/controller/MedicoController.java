package com.premier.consultorio.adapters.in.controller;

import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import com.premier.consultorio.infrastructure.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoService service;

    @PostMapping
    @Transactional
    public MedicoDTO salvar(@RequestBody MedicoDTO medicos){
        service.save(medicos);
        return medicos;
    }
//    @GetMapping
//    public ResponseEntity<DadosCadastroMedicoDTO> pegar(){
//       // List<DadosCadastroMedicoDTO> medicos = repository.findAll();
//        return ResponseEntity.ok(medicoDTO);
//    }
}
