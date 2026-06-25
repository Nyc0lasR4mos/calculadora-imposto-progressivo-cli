// Pacote de dados, aqui deverá ter os valores: Imposto Devido, Alíquota Efetiva e Renda Líquida
// Os valores devem ser retornados em um objeto do tipo ResultadoCalculo, que é uma classe que você vai criar
// Usar record para manter uma classe imutavel

package com.nycolasramos.calculadorair;

public record ResultadoCalculo(double impostoDevido, double aliquotaEfetiva, double rendaLiquida) {
}
