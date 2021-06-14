package javaDesafiosExercicios;

import java.util.Scanner;

public class identificadorNumPrimo {
	
	// Criar um progrma que receba um número e diga se ele é um número primo.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		entrada.close(); 
		
		int div = 0;

		for(int i = 2 ; i < num / 2 ; i++) {
			if(num % i == 0) {
				div++;
			}
		}
		if(div == 0) {
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo");
		}
	}
}
//Compreender melhor a matemática deste lógica.

/* auxiliar recebe 2
 * numero digitado é 2
 * Se auxiliar que é 2 for menor ou igual a 2 / 2
 * auxiliar recebe mais 1
 * 
 * Então, auxiliar que era 2, recebeu mais 1, ficou 3
 * 
 * Se a auxiliar que é 3 for % de 2
 */