package io.murilo.model;

public class Conta {

    public Conta() {
    }

    private Integer id;
    private double saldo;
    private Integer agencia;
    private Integer numero;
    private String Titular;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor foi depositado com sucesso");
    }

    public boolean podeSacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }

    public boolean podeTransferir(double valor, Conta contaDestino) {
        if (podeSacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}
