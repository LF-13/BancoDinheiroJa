package com.dinheiroJaBanco.controller;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numeroConta, double saldo) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void sacar(double valor) {
        this.saldo = saldo - valor;

    }

    public double transferir(Conta contaDestino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
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
