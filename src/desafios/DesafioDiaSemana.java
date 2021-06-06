package estrutura.controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite o dia da semana: ");
    String diasemana = entrada.next().replace("ç", "c").replace("á", "a");
    System.out.println(diasemana); //Utilizado para verificar se estava imprimindo corretamente o Ç e o Á. Problema ainda não resolvido.
    entrada.close();

    if(diasemana.equalsIgnoreCase("segunda")){
      System.out.println(2);
    } else{
      if(diasemana.equalsIgnoreCase("terca")){ //Cedilha não está sendo comparado no VSCode.
        System.out.println(3);
      } else{
        if(diasemana.equalsIgnoreCase("quarta")){
          System.out.println(4);
        } else{
          if(diasemana.equalsIgnoreCase("quinta")){
            System.out.println(5);
          } else{
            if(diasemana.equalsIgnoreCase("sexta")){
              System.out.println(6);
            } else{
              if(diasemana.equalsIgnoreCase("sabado")){
                System.out.println(7);
              } else {
                if(diasemana.equalsIgnoreCase("domingo")){
                  System.out.println(1);
                } else{
                  System.out.println(diasemana); //Imprimindo o valor final de diasemana.
                  System.out.println("Dia inválido");
                }
              }
            }
          }
        }
      }
    }
  }
}

/*
  O usuário vai digitar o dia da semana e o console vai retornar o número.

  Domingo -> 1
  Segunda -> 2
  Terça -> 3
  Quarta -> 4
  Quinta -> 5
  Sexta -> 6
  Sábado -> 7

*/