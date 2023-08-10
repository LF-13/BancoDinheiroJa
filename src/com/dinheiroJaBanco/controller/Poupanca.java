package com.dinheiroJaBanco.controller;

import java.math.BigDecimal;

public class Poupanca extends Conta implements Investimento {

    public Poupanca(Pessoa titular, int agencia, int numeroConta, BigDecimal saldo) {
        super(titular, agencia, numeroConta, saldo);
    }

    @Override
    public BigDecimal tempoDeInvestimeto(BigDecimal valor, BigDecimal tempo, BigDecimal taxa) {
        BigDecimal tempoTotal = valor.multiply(tempo);
        BigDecimal multiply = tempo.multiply(taxa);
        BigDecimal resultado = multiply.add(tempoTotal);
        return resultado;
    }

    @Override

    public BigDecimal getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void depositar(BigDecimal valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(BigDecimal valor) {
        super.sacar(valor);
    }

}
