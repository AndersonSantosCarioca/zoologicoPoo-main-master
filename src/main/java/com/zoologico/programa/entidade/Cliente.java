package com.zoologico.programa.entidade;

public class Cliente extends Pessoa{
    private int id;
    private float valorPago;
    private int quantIngresso;
   

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

    public Cliente(int id, String nome, Endereco endereco, Contato contato, String cpf, int id2, float valorPago,
            int quantIngresso) {
        super(id, nome, endereco, contato, cpf);
        id = id2;
        this.valorPago = valorPago;
        this.quantIngresso = quantIngresso;
    }
    
    public Cliente(int id, String nome, int id2, float valorPago, int quantIngresso) {
        super(id, nome);
        id = id2;
        this.valorPago = valorPago;
        this.quantIngresso = quantIngresso;
    }
    
    public Cliente(int id, float valorPago, int quantIngresso) {
        this.id = id;
        this.valorPago = valorPago;
        this.quantIngresso = quantIngresso;
    }

    public int getId() {
        return id;
    }

}
