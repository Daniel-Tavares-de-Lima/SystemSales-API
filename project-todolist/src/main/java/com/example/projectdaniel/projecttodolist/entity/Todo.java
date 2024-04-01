package com.example.projectdaniel.projecttodolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")

public class Todo {

    // ---IDENTIFICADOR DA TABEL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridades;

    /*----GETS */
    
    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean getRealizado(){
        return realizado;
    }

    public int getPrioridades(){
        return prioridades;
    }
    /*----------- */

    /**--SETS */
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public void setPrioridades(int prioridades) {
        this.prioridades = prioridades;
    }

    /**-------SETS */



}
