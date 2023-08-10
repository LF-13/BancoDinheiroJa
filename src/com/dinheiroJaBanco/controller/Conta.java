package com.dinheiroJaBanco.controller;

import java.math.BigDecimal;

public abstract class Conta {
    private Pessoa titular;
    private int agencia;
    private int numeroConta;
    private BigDecimal saldo;

    public Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numeroConta, BigDecimal saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void depositar(BigDecimal valor) {
        this.saldo = saldo.add(valor);
//        this.saldo = saldo + valor;
    }

    public void sacar(BigDecimal valor) {
        this.saldo = saldo.subtract(valor);
//        this.saldo = saldo - valor;

    }

    public BigDecimal transferir(Conta contaDestino, BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("       🔰💲EXTRATO🔰💲");
            System.out.printf("Títular: %s%nAgência: %d%nNúmero da Conta: %d%nSaldo: %.2f%n%n", contaDestino.titular.getNome(), contaDestino.getAgencia(), contaDestino.getNumeroConta()
                    , contaDestino.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
        return valor;
    }
}
