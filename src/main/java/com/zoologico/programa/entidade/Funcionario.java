package com.zoologico.programa.entidade;

public class Funcionario extends Pessoa{// declaração de variáveis
   String funcao;
   int ctps;
public Funcionario(int id, String nome, Endereco endereco, Contato contato, String cpf, String funcao, int ctps) {
    super(id, nome, endereco, contato, cpf);
    this.funcao = funcao;
    this.ctps = ctps;
}
public Funcionario(int id, String nome, String funcao, int ctps) {
    super(id, nome);
    this.funcao = funcao;
    this.ctps = ctps;
}
public Funcionario(String funcao, int ctps) {
    this.funcao = funcao;
    this.ctps = ctps;
}
public String getFuncao() {
    return funcao;
}
public void setFuncao(String funcao) {
    this.funcao = funcao;
}
public int getCtps() {
    return ctps;
}
public void setCtps(int ctps) {
    this.ctps = ctps;
}



}
