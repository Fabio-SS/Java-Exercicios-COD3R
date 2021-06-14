	/* Desafio While
	 * Calcular a média das notas dos alunos da turma sem saber a quantia de alunos.
	 * O usuário vai digitar uma nota válida entre 0 e 10 que será armazenada em uma variavel total.
	 * Toda vez que for passada uma nova nota válida, essa variavel vai adicionar essa quantia a variavel total.
	 * Criar variável para identificar quantas notas válidas foram digitadas.
	 * Sinal para sair do programa -1
	 */

package javaDesafiosExercicios;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		//Declarando variável
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) { //Se o usuário digitar -1, vai sair do laço.
			System.out.print("Digite a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas ++;
			} else if(nota != -1) { 
				System.out.println("Nota inválida!"); //Se o usuário digitar algo fora do range de 0 à 10.
			}
		}
		
		//Calcular a média		
		double media = total / quantidadeDeNotas;
		System.out.print("Média: " + media);
		entrada.close();
	}
}