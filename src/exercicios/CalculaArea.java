package exercicios;

import java.util.Scanner;

public class CalculaArea {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o tamanho da base do triangulo: ");
    double base = entrada.nextDouble();

    System.out.println("Digite a altura do triangulo: ");
    double altura = entrada.nextDouble();

    double area = (base * altura) / 2;

    System.out.println("A área do triangulo é: " + area);

    entrada.close();
    
    /*
      Ler valor da base e da altura de um triangulo e calcule a área.
        Base * Alutra / 2
    */

  }
  
}
