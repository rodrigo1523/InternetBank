package model;

public class conta {

    private int numero;
    private Double saldo;

    public conta(int numero, Double saldo) {
            this.numero = numero;
            this.saldo = saldo;
    }

    public void depositar(Double quantia){
        this.saldo += quantia;


    }

    public int getNumero() {
        return numero;
    }

    public void retirar(double quantia){
        this.saldo -= quantia;
    }

    public Double getSaldo() {
        return saldo;


    }


    @Override
    public String toString() {
        return "conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
