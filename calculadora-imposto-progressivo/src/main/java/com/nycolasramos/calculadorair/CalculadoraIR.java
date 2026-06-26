package com.nycolasramos.calculadorair;



public class CalculadoraIR {

    private static final double FAIXA_1_LIMITE = 5000.00;
    private static final double FAIXA_1_ALIQUOTA = 0.0;
    private static final double FAIXA_2_LIMITE = 6500.00;
    private static final double FAIXA_2_ALIQUOTA = 0.075;
    private static final double FAIXA_3_ALIQUOTA = 0.15;

    public ResultadoCalculo calcular(double rendaBruta) {
        if (rendaBruta < 0) {
            throw new IllegalArgumentException("A renda bruta não pode ser negativa.");
        }

        double impostoDevido = 0.0;

        if (rendaBruta > FAIXA_2_LIMITE) {
            impostoDevido += (rendaBruta - FAIXA_2_LIMITE) * FAIXA_3_ALIQUOTA;
            impostoDevido += (FAIXA_2_LIMITE - FAIXA_1_LIMITE) * FAIXA_2_ALIQUOTA;
        } else if (rendaBruta > FAIXA_1_LIMITE) {
            impostoDevido += (rendaBruta - FAIXA_1_LIMITE) * FAIXA_2_ALIQUOTA;
        }

        double aliquotaEfetiva = (rendaBruta == 0) ? 0 : (impostoDevido / rendaBruta) * 100;
        double rendaLiquida = rendaBruta - impostoDevido;

        return new ResultadoCalculo(impostoDevido, aliquotaEfetiva, rendaLiquida);
    }
}