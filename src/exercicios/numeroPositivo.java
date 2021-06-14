package javaDesafiosExercicios;

import java.util.Scanner;

/*
 * Criar um programa que enquanto estiver recebendo números positivos,
 * imprime no console a soma dos números inseridos,
 * aso receba um número negativo, encerre o programa. 
 * Tente utilizar a estrutura do while.
 */

public class numeroPositivo {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		int num = 0;
		
		while(num >= 0) {
			System.out.printf("Digite um número inteiro(zero ou negativo para sair): ");
			num = entrada.nextInt();
			if(num >= 0) {
				soma += num;
				System.out.println("A soma até o momento é: " + soma);
			}
		}
		
		System.out.println("Fim");
		entrada.close();	
	}
}
