package javaDesafiosExercicios;

import java.util.Scanner;

//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.

public class leituraNumeroPar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10) {
			if(num % 2 == 0) {
				System.out.println("O número " + num + " é par!");
			} else {
				System.out.println("O número " + num + " é impar!");
			}
		}else {
			System.out.println("Número inválido!");
		}
		System.out.println("Fim!");
		entrada.close();
	}
}
