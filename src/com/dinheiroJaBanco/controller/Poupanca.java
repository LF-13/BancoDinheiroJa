package com.dinheiroJaBanco.controller;

public class Poupanca extends Conta implements Investimento {

    public Poupanca(Pessoa titular, int agencia, int numeroConta, double saldo) {
        super(titular, agencia, numeroConta, saldo);
    }

    @Override
    public double tempoDeInvestimeto(double valor, double tempo, double taxa) {
        return valor + (tempo * taxa);
    }

    @Override

    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

}
