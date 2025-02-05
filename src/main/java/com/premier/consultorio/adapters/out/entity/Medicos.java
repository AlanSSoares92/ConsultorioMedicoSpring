package com.premier.consultorio.adapters.out.entity;

import com.premier.consultorio.adapters.in.dto.request.MedicoDTO;
import jakarta.persistence.*;

@Entity(name = "medicos")
@Table(name = "tb_medico")
public class Medicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nome;
    private String email;
    private String telefone;
    private String CRM;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Medicos() {
    }

    public Medicos(MedicoDTO medico) {
        this.CRM = medico.getCRM();
        this.endereco = medico.getEndereco();
        this.email= medico.getEmail();
        this.Nome = medico.getNome();
        this.especialidade= medico.getEspecialidade();
        this.telefone = medico.getTelefone();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Medicos(String nome, String email, String telefone, String CRM, Especialidade especialidade, Endereco endereco) {
        Nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
}
