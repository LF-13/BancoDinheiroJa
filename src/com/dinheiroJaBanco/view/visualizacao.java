package com.dinheiroJaBanco.view;
/**
 * Estou melhorando por partes e para melhorar meu entendimento do que fiz, estou comentando// códigos iniciais.
 */

import com.dinheiroJaBanco.controller.Conta;
import com.dinheiroJaBanco.controller.Pessoa;
import com.dinheiroJaBanco.controller.Poupanca;

import java.math.BigDecimal;

public class visualizacao {
    public static void main(String[] args) {

//        Conta conta1 = new Conta();
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Larissa");
//        titular1.setCpf("10101010101");
//        conta1.setAgencia(123);
//        conta1.setNumeroConta(1234);
//        conta1.setSaldo(200);
//        System.out.printf("Nome: %s%n, Cpf: %s%n, Agencia: %d%n, Número Conta: %d%n, Saldo: %.2f%n",
//                titular1.getNome(), titular1.getCpf(), conta1.getAgencia(), conta1.getNumeroConta(), conta1.getSaldo());

//        Conta conta2 = new Conta();
        Pessoa titular2 = new Pessoa();
        titular2.setNome("Sófia cheiroquinha");
//        titular2.setCpf("151151511111");
//        conta2.setAgencia(789);
//        conta2.setNumeroConta(34315);
//        conta2.setSaldo(400);
//        System.out.printf("%nNome: %s%n, Cpf: %s%n, Agencia: %d%n, Número Conta: %d%n, Saldo: %.2f%n",
//                titular2.getNome(), titular2.getCpf(), conta2.getAgencia(), conta2.getNumeroConta(), conta2.getSaldo());
//        conta2.depositar(50);
//        System.out.printf("Saldo: %.2f", conta2.getSaldo());
//        conta2.sacar(50);
//        System.out.printf("%nSaldo atualizado: %.2f", conta2.getSaldo());


        Conta contaTeste1 = new Poupanca(titular1, 1313, 5555, new BigDecimal("400"));
        Conta contaTeste2 = new Poupanca(titular2, 1414, 6666, new BigDecimal("0"));
        double valorTransferido = 40;
        contaTeste1.transferir(contaTeste2, new BigDecimal(valorTransferido));

        System.out.println("Saldo contaTeste1: " + contaTeste1.getSaldo());
        System.out.println("Saldo contaTeste2: " + contaTeste2.getSaldo());

        Poupanca contaPoupanca1 = new Poupanca(titular1, 12443, 564654, new BigDecimal("400"));
        BigDecimal valor = new BigDecimal("100");
        BigDecimal tempo = new BigDecimal("3");
        BigDecimal taxa = new BigDecimal("10");

        BigDecimal resultado = contaPoupanca1.tempoDeInvestimeto(valor, tempo, taxa);


        System.out.printf("Valor + Tempo * Taxa: %.2f%n", resultado);

    }
}
