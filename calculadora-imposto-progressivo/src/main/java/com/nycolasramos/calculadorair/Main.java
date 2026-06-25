package com.nycolasramos.calculadorair;

import com.nycolasramos.calculadorair.CalculadoraIR;
// Removed explicit import for ResultadoCalculo (resolver issues when class isn't available to import)
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\n..... Calculadora de salário com imposto de renda progressivo .....\n\n");

            System.out.print("Informe a renda bruta mensal (R$): ");
            if (!scanner.hasNextDouble()) {
                System.err.println("Erro: Valor inválido. Informe um número positivo.");
                System.exit(1);
            }

            double rendaBruta = scanner.nextDouble();

            CalculadoraIR calculadora = new CalculadoraIR();
            var resultado = calculadora.calcular(rendaBruta);

            System.out.printf("Imposto Devido: R$ %.2f%n", resultado.impostoDevido());
            System.out.printf("Alíquota Efetiva: %.2f%%%n", resultado.aliquotaEfetiva());
            System.out.printf("Renda Líquida: R$ %.2f%n", resultado.rendaLiquida());

            scanner.close();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
            System.exit(1);
        }
    }
}

