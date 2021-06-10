package javaDesafiosExercicios;

import java.util.Scanner;

public class notaMedia {
	
	/*
	 * Criar um programa que receba duas notas parciais, calcular a média final.
	 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado".
	 * Se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação".
	 * Caso contrário imprime no console "Reprovado".
	 */
	
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.printf("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		entrada.close();
		
		//Calculo Média
		double media = (nota1 + nota2) / 2;
		
		//Lógica 02
		if(media > 4.0 && media < 7.0) {
			System.out.println("Em recuperação");
		}else if(media <= 10) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		System.out.println("Media final: " + media);
		System.out.println("Fim");
		
		//Lógica 01
		//if(media >= 7.0 && media  <= 10) {
		//	System.out.println("Aprovato");
		//}else if(media < 7.0 && media > 4.0) {
		//	System.out.println("Em recuperação");
		//}else {
		//	System.out.println("Reprovado");
		//}
		//System.out.println("Media final: " + media);
		//System.out.println("Fim");
	}
}