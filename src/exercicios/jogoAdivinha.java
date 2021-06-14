package javaDesafiosExercicios;

import java.util.Scanner;

public class jogoAdivinha {
	
	/*
	 * Jogo da adivinhação
	 * Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. 
	 * O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
	 * e imprima se o número inserido é maior ou menor do que o número armazenado. 
	 */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador = 9;
		int numSecreto = 100;
		
		while(contador >= 0) {
			
			System.out.printf("Digite um número: ");
			int num = entrada.nextInt();
			
			for(int i = 1 ; i <= 10 ; i++) {
				if(num == numSecreto) {
					System.out.println("Você adivinou o número, parabéns");
					contador = 0;
					break;
				} else if(num > numSecreto) {
					System.out.println("O número digitado é maior que o número secreto");
					break;
				} else {
					System.out.println("O número digitado é menor que o número secreto");
					break;
				}
			}
			if(contador == 0){
				System.out.println("Fim de jogo!");
			} else {
				System.out.println("Você ainda possui: " + contador + " tentativas");
			}
			contador--;
		}
		entrada.close();
	}
}
