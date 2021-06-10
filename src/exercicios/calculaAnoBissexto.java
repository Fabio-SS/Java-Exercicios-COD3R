package javaDesafiosExercicios;

import java.util.Scanner;

public class calculaAnoBissexto {
		
		//Calcular se um ano é bissexto ou não.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o ano: ");
		double ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("O " + ano + " é bissexto");
			if(ano % 100 == 0 && ano % 400 != 0) {
				System.out.println("O" + ano + "Não é bissexto");
				if(ano % 100 == 0 && ano % 400 == 0) {
					System.out.println("O" + ano + "é bissexto");
				}
			}
		}else {
			System.out.println("Não é bissexto");
		}
		entrada.close();
		
	};
}
//Analisar código pois alguns anos bissextos estão sendo informados como não bissexto.