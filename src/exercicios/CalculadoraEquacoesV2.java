
/*
Utilizar como exemplo: A = 1 | B = 12 | C = -13

Passo 1: Fórmula para Delta = b² - 4*a*c

Passo 2: calculo de x1(-b + Raiz Quadrada de Detal / 2 * A) | x2(-b - Raiz Quadrada de Detal / 2 * A) 
*/


package exercicios;

import java.util.Scanner;

public class CalculadoraEquacoesV2 {

  public static void main(String[] args) {

    System.out.println("Sua equação é: (Ax² + Bx + C = 0)");

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor de A: ");
    int a = entrada.nextInt();

    System.out.println("Digite o valor de B: ");
    int b = entrada.nextInt();

    System.out.println("Digite o valor de C: ");
    int c = entrada.nextInt();

    int delta = (b * b) - (4 * a * c);
    System.out.println("O valor de Delta é: " + delta);

    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    System.out.println("O x1 da equação é: " + x1);

    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.println("O x2 da equação é: " + x2);

    entrada.close();
  }
  
}