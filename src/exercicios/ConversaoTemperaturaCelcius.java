package exercicios;

import java.util.Scanner;

public class ConversaoTemperaturaCelcius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius ");
        double celsius = scanner.nextDouble();
        double conversao = ( celsius * 1.8) + 32;

        System.out.println("Valor em Fahrenheit: " + conversao);

        scanner.close();

        /*

        Fórmula da conversão Celcius
        F = (Valor em Celcius digitado * 1.8) + 32
        F = (30 vezes 1.8) + 32

        */
    }
}