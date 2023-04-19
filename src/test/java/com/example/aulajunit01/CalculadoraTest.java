package com.example.aulajunit01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void dados2NumerosPositivos_quandoPrimeiroMaiorQueSegundo_entaoResultadoPositivo() {
        int primeiro = 10;
        int segundo = 3;
        assertTrue(primeiro > segundo); // Preparando o cenário

        Calculadora c = new Calculadora();
        int result = c.somar(primeiro, segundo);

//      assertTrue(r > 0);
        assertEquals(13, result);
    }

    @Test
    public void dadoZeroEPositivo_entaoResultadoDeveSerOSegundo() {
        int primeiro = 0;
        int segundo = 8;

        Calculadora c = new Calculadora();
        int result = c.somar(primeiro, segundo);

        assertEquals(segundo, result);
    }
}