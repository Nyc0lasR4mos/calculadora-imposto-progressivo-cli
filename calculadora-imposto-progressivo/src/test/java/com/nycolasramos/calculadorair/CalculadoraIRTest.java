package com.nycolasramos.calculadorair;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIRTest {

    private final CalculadoraIR calculadora = new CalculadoraIR();

    @Test
public void testRendaZero() {
    ResultadoCalculo resultado = calculadora.calcular(0.0);
    
    assertEquals(0.0, resultado.impostoDevido(), 0.001);
    assertEquals(0.0, resultado.aliquotaEfetiva(), 0.001);
    assertEquals(0.0, resultado.rendaLiquida(), 0.001);
}
    @Test
    public void testRendaIsenta() {
        ResultadoCalculo resultado = calculadora.calcular(4000.0);
        
        assertEquals(0.0, resultado.impostoDevido(), 0.001);
        assertEquals(0.0, resultado.aliquotaEfetiva(), 0.001);
        assertEquals(4000.0, resultado.rendaLiquida(), 0.001);
    }
    @Test
    public void testRendaFaixa2() {
        ResultadoCalculo resultado = calculadora.calcular(5500.0);
        
        assertEquals(37.50, resultado.impostoDevido(), 0.001);
        assertEquals(0.6818, resultado.aliquotaEfetiva(), 0.001);
        assertEquals(5462.50, resultado.rendaLiquida(), 0.001);
    }
    @Test
    public void testRendaFaixa3() {
        ResultadoCalculo resultado = calculadora.calcular(7000.0);
        
        assertEquals(187.50, resultado.impostoDevido(), 0.001);
        assertEquals(2.6786, resultado.aliquotaEfetiva(), 0.001);
        assertEquals(6812.50, resultado.rendaLiquida(), 0.001);
    }
    @Test
    public void testRendaNegativaLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcular(-100.0));
    }
}