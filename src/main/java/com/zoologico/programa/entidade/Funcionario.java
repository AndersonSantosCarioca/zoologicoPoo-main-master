package com.zoologico.programa.entidade;

public class Funcionario extends Pessoa{// declaração de variáveis
   String funcao;
   int ctps;

public int getCtps() {
    return ctps;
}

public void setCtps(int ctps) {
    this.ctps = ctps;
}

public Funcionario(int id, String nome, String endereco, int cep, String logradouro,String funcao) {
    super(id, nome, endereco, cep, logradouro, contato, funcao);
    this.funcao = funcao;    
}

public Funcionario(int id, String funcao) {
    super(id);
    this.funcao = funcao;
}

public String getFuncao() {
    return funcao;
}

public void setFuncao(String funcao) {
    this.funcao = funcao;
}   
}
