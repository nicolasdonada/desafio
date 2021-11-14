package src.Switch;

import java.util.Scanner;

public class Switch1 
{  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numeroMes = scan.nextInt();

        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"

        };

switch(numeroMes){
    case 1:
      System.out.println(meses[0]);
      break;
      case 2:
      System.out.println(meses[1]);
      break;
    case 3:
      System.out.println(meses[2]);
      break;
    case 4:
      System.out.println(meses[3]);
      break;
    case 5:
      System.out.println(meses[4]);
      break;
    case 6:
      System.out.println(meses[5]);
      break;
    case 7:
      System.out.println(meses[6]);
      break;
    case 8:
      System.out.println(meses[7]);
      break;
    case 9:
      System.out.println(meses[8]);
      break;
    case 10:
      System.out.println(meses[9]);
      break;
    case 11:
      System.out.println(meses[10]);
      break;
    case 12:
      System.out.println(meses[11]);
      break;
    default:
      System.out.println("Mes invalido!");

      scan.close();

        
          }

      }
    
}
