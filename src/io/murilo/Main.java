package io.murilo;

import io.murilo.model.Cliente;
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

        Cliente paulo = new Cliente();
        paulo.setId(1);
        paulo.setNome("Paulo Lima");
        paulo.setCpf("0201");
        paulo.setProfissao("motorista");

        Cliente henrique = new Cliente();
        henrique.setId(2);
        henrique.setNome("Henrique Lima");
        henrique.setCpf("0213");
        henrique.setProfissao("contador");

        System.out.println("Setando clientes para contas por meio da composiçao");
        conta.setTitular(paulo);
        contaDestino.setTitular(henrique);
        System.out.println("A conta" + conta.getId() + "possui o titular :" + conta.getTitular());
        System.out.println("A conta" + contaDestino.getId() + "possui o titular :" + contaDestino.getTitular());
    }
}
