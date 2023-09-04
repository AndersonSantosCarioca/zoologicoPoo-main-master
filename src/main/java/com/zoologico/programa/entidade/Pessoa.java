package com.zoologico.programa.entidade;

public class Pessoa {
    private int id;
    private String nome;
    private Endereco endereco;
    static Contato contato;
    protected static String cpf;
   
   

    //construtor de cliente e funcionário
    public Pessoa(int id, String nome, Endereco endereco,Contato contato,String cpf) {
        this.id = id;      
        this.nome = nome;
        this.endereco = endereco; 
        Contato.contato = contato;  
        this.cpf = cpf;   
       
    }

    //construtor de contato de emergência
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa() {
        
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
