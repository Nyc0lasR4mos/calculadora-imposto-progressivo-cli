package com.nycolasramos.calculadorair;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Configura o Locale para US para garantir que ponto seja o separador decimal
        Locale.setDefault(Locale.US);
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("\n..... Calculadora de salário com imposto de renda progressivo .....\n");

            System.out.print("Informe a renda bruta mensal (R$): ");
            
            if (!scanner.hasNextDouble()) {
                System.err.println("Erro: Valor inválido. Informe um número positivo.");
                System.exit(1);
            }

            double rendaBruta = scanner.nextDouble();

            CalculadoraIR calculadora = new CalculadoraIR();
            ResultadoCalculo resultado = calculadora.calcular(rendaBruta);

            // Formatação consistente com 2 casas decimais
            System.out.printf("Imposto Devido: R$ %.2f%n", resultado.impostoDevido());
            System.out.printf("Alíquota Efetiva: %.2f%%%n", resultado.aliquotaEfetiva());
            System.out.printf("Renda Líquida: R$ %.2f%n", resultado.rendaLiquida());

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
            System.exit(1);
        }
    }
}