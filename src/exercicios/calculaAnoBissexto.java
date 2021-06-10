package javaDesafiosExercicios;

import java.util.Scanner;

public class calculaAnoBissexto {
		
		//Calculo se um ano é bissexto ou não.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o ano: ");
		int ano = entrada.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0)) 
			System.out.println("Ano Bissexto");
		else
			System.out.println("Não é ano bissexto");
		
		entrada.close();
		
	};
}