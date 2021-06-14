package javaDesafiosExercicios;

import java.util.Scanner;

public class maiorValor {
	public static void main(String[] args) {
		
		int maiorValor = 0;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.printf("Digite um valor: ");
			int valor = entrada.nextInt();
			
			//Se o valor digitado for maior que maiorValor
			if(valor > maiorValor) {
				//maiorValor recebe o valor digitado
				maiorValor = valor; 
			}
			//adiciona a contagem do contador +1
			contador++;
			//Enquanto o contador for diferente de 10, ele vai continuar executando o laço
		}while(contador != 10);
		System.out.printf("O maior valor foi: " + maiorValor);		
		entrada.close();		
	}
}
