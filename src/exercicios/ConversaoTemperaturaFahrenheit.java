package exercicios;

import java.util.Scanner;

public class ConversaoTemperaturaFahrenheit {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperautra em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        double conversao = (fahrenheit - 32) / 1.8;

        System.out.println("O valor em Celcius é: " + conversao);

        entrada.close();
        /*

        Fórmula da conversão Fahrenheit
        F = (Valor em Fahrenheit digitado - 32) / 1.8
        F = (30 - 32) dividido por 1.8

        */
    }
}
