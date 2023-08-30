package com.zoologico.programa.entidade;

public class Pessoa {
    private int id;
    private String nome;
    private String endereco;
    private int cep;
    static Contato contato;
    private String cpf;
   
   

    //construtor de cliente e funcionário
    public Pessoa(int id, String nome, String endereco, int cep, String logradouro,Contato contato,String cpf) {
        this.id = id;      
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;  
        Pessoa.contato = contato;  
        this.cpf = cpf;   
       
    }

    //construtor de contato de emergência
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String logradouro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        Pessoa.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean validaCpf(String cpf){
        if(cpf.length() == 11){
            return true;
        }else{
            return false;
        }
       
    }


}
