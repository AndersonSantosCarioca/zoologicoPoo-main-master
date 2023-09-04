package com.zoologico.programa.entidade;

public class Contato {
    public static Contato contato;
    private int telefoneFixo;
    private int telefoneCelular;
    private String email;
    Pessoa telefoneEmergencia;

    // coonstrutor contato cliente
    public Contato(int telefoneFixo, int telefoneCelular, String email, Pessoa telefoneEmergencia) {
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.telefoneEmergencia = telefoneEmergencia;
    }

    //construtor contato funcionário
    public Contato(int telefoneCelular, String email) {
        this.telefoneCelular = telefoneCelular;
        this.email = email;
    }
    public int getTelefoneFixo() {
        return telefoneFixo;
    }
    public void setTelefoneFixo(int telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    public int getTelefoneCelular() {
        return telefoneCelular;
    }
    public void setTelefoneCelular(int telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Pessoa getTelefoneEmergencia() {
        return telefoneEmergencia;
    }
    public void setTelefoneEmergencia(Pessoa telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }
}
