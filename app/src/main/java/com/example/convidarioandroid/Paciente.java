package com.example.convidarioandroid;

import java.util.Date;

public class Paciente {
    // Declaração da váriavel.
    private String nome;
    private String local;
    private Date dataNascimento;
    private Date dataHoje;
    // Metodo para retornar a informação inserida pelo usuário.

    public String getNome() {

        return this.nome;
    }

    // Metodo para adicionar a informação inseria pelo ussário.

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Date getDataNascimento() {

        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public Date getDataHoje() {

        return this.dataHoje;
    }

    public void setDataHoje(Date dataHoje) {

        this.dataHoje = dataHoje;
    }

    public String getLocal() {

        return this.local;
    }

    public void setLocal(String local) {

        this.local = local;
    }
}
