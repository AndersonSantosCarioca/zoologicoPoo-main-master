package com.zoologico.programa.entidade;

public class Cliente {
    private int id;
    private String nome;
    private float valorPago;
    private int quantIngresso;
    private Endereco  endereco;



public Cliente(int id,String nome, float valorPago,int quantIngresso,Endereco endereco){
    this.id = id;
    this.nome = nome;
    this.valorPago = valorPago;
    this.quantIngresso = quantIngresso;
    this.endereco = endereco;
    }

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

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public int getQuantIngresso() {
        return quantIngresso;
    }

    public void setQuantIngresso(int quantIngresso) {
        this.quantIngresso = quantIngresso;
    }
    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }

public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
