package exercicios;

import java.util.Scanner;

public class CalculadoraEquacoes {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor de a: ");
    double a = entrada.nextDouble();
    
    System.out.println("Digite o valor de b: ");
    double b = entrada.nextDouble();
    
    System.out.println("Digite o valor de c: ");
    double c = entrada.nextDouble();

    double formA = Math.pow(b, 2);
    double formB = 4 * a * (-c);
    System.out.println(formB);

    double delta = formA + formB;
    
    System.out.println("O delta é: " + delta);

    entrada.close();

  }


  /*
  a = 1
  b = 12
  C = -13
  Delta = b² - 4ac
  Delta = 12² - 41(-13)
  Delta = 144 + 4*1*(-13)
  Delta = 144 + 52
  Delta = 196
  */
}
