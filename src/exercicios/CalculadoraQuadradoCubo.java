package exercicios;

import java.util.Scanner;

public class CalculadoraQuadradoCubo {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um valor");
    double valor = entrada.nextDouble();
    
    //Modelo 1
    //double quadrado = valor * valor ;
    
    //Modelo 2
    double quadrado;    
    quadrado = Math.pow(valor, 2);
    
    //Modelo 1
    //double cubo = (valor * valor) * valor;

    //Modelo 2
    double cubo;
    cubo = Math.pow(valor, 3);
    
    System.out.println("Valor ao quadrado: " + quadrado);
    System.out.printf("Valor ao cubo é %.2f" , cubo);


    entrada.close();

    /*
    Fórmula: Quadrado: valor*valor Cubo: Valor*Valor*Valor

    Math.pow(X, Y)
    X = Valor escolhido(Base)
    Y = Potência(Expoente)
    */

  }
  
}