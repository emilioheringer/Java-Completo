package com.emilioheringer.aula2;

import java.io.IOException;

public class Aula2 {
    public static void main(String[] args) throws IOException {
       /** int condicao = 10;

        if (condicao==6){
            System.out.println("Condicao = a 5");
        }else if(condicao==4){
            System.out.println("Condicao = a 4");
        }else{
            System.out.println("Nenhuma condicao é verdadeira");
        }
    }*/

      /** int condicao =1;
       switch (condicao){
           case 10:
            System.out.println("Condicao é 10");
            break;
           case 5:
               System.out.println("Condicao é 5");
               break;
           case 4:
               System.out.println("Condicao é 4");
               break;
           default:
               System.out.println("Nenhuma condicao é verdadeira");
       }*/

     /** char c;
      System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Jogar ");
        System.out.println("2 - Carregar Jogo ");
        System.out.println("3 - Configurar ");
        System.out.println("4 - Sair ");

            c = (char) System.in.read();


        switch (c){
            case '1':
                System.out.println("Jogo iniciado");
                break;
            case '2':
                System.out.println("Jogo carregado");
            case '3':
                System.out.println("Configurações");
                break;
            case '4':
                System.out.println("jogo finalizado");
                break;
            default:
                System.out.println("Opcao Inválida");
                break;
        }
    }*/

        int x = 5;
     if(true){
         System.out.println("Valor de x é: " +x);
     }

    }
}

