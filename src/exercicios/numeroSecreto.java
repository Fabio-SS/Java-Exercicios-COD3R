package javaDesafiosExercicios;

import java.util.Scanner;

public class numeroSecreto {
	
	/*
	 * Jogo da adivinhação
	 * Tentar adivinhar um número entre 0 - 100. 
	 * Armazene um numero aleatório em uma variável. 
	 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
	 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes.
	 * Imprima se o número inserido é maior ou menor do que o número armazenado. 
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int tentativas;
		int continuar;
		int num;
		
		do {
			int numSecreto = 100;
			System.out.println("Tente adivinhar um número entre 0 e 100!");
			tentativas = 0;
			do {
				tentativas++;
				System.out.println("Tentativas: " + tentativas);
				System.out.printf("Digite um número: ");
				num = entrada.nextInt();
				
				if(num > numSecreto) {
					System.out.println("O número " + num + " é maior que o número secreto!");
				}else if(num < numSecreto) {
					System.out.println("O número " + num + " é menor que o número secreto!");
				}else {
					System.out.println("Parabéns, você acertou o número secreto: " + num);
				}				
			}while(tentativas != 10);
				System.out.println("Acabou suas tentativas!");
				System.out.printf("Quer tentar de novo? Digite qualquer número ou digite 0 para sair: ");
				continuar = entrada.nextInt();
			
		}while(continuar != 0);
		System.out.println("Fim!");
				
		entrada.close();
	}

}
