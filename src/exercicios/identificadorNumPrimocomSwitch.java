package javaDesafiosExercicios;

import java.util.Scanner;

public class identificadorNumPrimocomSwitch {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		int num = entrada.nextInt();
		entrada.close();
		
		int div = 0;

		for(int i = 2 ; i < num / 2 ; i++) {
			if(num % i == 0) {
				div++;
			}
		}

		switch (div) {

		case 0:
			System.out.println("O numero " + num + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + num + " não é um numero primo.");

		}

	}
}
