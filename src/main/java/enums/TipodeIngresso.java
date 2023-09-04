package enums;

public enum TipodeIngresso {
    MEIA(20.0),INTEIRA(40.0);
private double valor;

    TipodeIngresso(double valor) {
        this.valor = valor;
    }
    public double getvalor(){
        return valor;
    }


    
}
