package com.premier.consultorio.adapters.in.dto.request;

import com.premier.consultorio.adapters.out.entity.Endereco;
import com.premier.consultorio.adapters.out.entity.Especialidade;
import com.premier.consultorio.adapters.out.entity.Medicos;

import java.util.List;

public class MedicoDTO {
    private String Nome;
    private String email;
    private String telefone;
    private String CRM;
    private Especialidade especialidade;
    private Endereco endereco;

    public MedicoDTO(Medicos medicos) {
    }

    public MedicoDTO() {
    }

    public MedicoDTO(List<Medicos> listMedicos) {

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
}
