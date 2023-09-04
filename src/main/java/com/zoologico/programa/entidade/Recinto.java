package com.zoologico.programa.entidade;

public class Recinto extends Setor {
    private int id;
    private String nome;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Recinto(int id, String nome, int id2, String nome2) {
        super(id, nome);
        id = id2;
        nome = nome2;
    }

}
