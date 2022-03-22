package io.murilo;

import io.murilo.model.Conta;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setId(1);
        conta.setSaldo(50.0);
        conta.depositar(100.0);
        System.out.println(conta.getSaldo());
        System.out.println(conta.podeSacar(120.0));
        System.out.println(conta.getSaldo());
        System.out.println("----------------------");


        System.out.println("Operação de transferencia");
        Conta contaDestino = new Conta();
        contaDestino.setId(2);
        contaDestino.setSaldo(20.0);
        conta.podeTransferir(10.0, contaDestino);
        System.out.println(contaDestino.getSaldo());

    }
}
