package com.dinheiroJaBanco.controller;

import java.math.BigDecimal;

public interface Investimento {
    BigDecimal tempoDeInvestimeto(BigDecimal valor, BigDecimal tempo, BigDecimal taxa);

}
