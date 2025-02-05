package com.premier.consultorio.adapters.out.repositories;

import com.premier.consultorio.adapters.out.entity.Medicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medicos, Long> {

    Medicos save(Medicos medicos);
}
