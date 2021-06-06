package exercicios;

import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Qual é o seu peso?");
    double peso = entrada.nextDouble();

    System.out.println("Qual é o seu altura?");
    double altura = entrada.nextDouble();

    double IMC = peso / (altura * altura);

    System.out.printf("O seu IMC é %.2f :" , IMC);

    entrada.close();

    /*
    Fórmula
    IMC = 71KG / (1,70M x 1,70M)
    */
  }
  
}
