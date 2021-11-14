package src.Switch;

import java.util.Scanner;

public class Switch3
{
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("< Conversão de moedas >");
		
    System.out.println("Digite o valor base a ser convertido: ");
    double valorBase = scan.nextDouble();
    
    System.out.println(" 1 - Real para Dólar \n 2 - Dólar para Real \n 3 - Real para Euro \n 4 - Sair");
    int opcaoEscolhida = scan.nextInt();
    
    double valorConvertido = 0;

	  do{
	    switch(opcaoEscolhida){
	      case 1: // real pra dolar
	        valorConvertido = valorBase / 5.46;
    	    System.out.printf("Valor em dolares é R$  R", valorConvertido);
	        break;
	        
	      case 2: // dolar pra real
	        valorConvertido = valorBase * 5.46;
    	    System.out.printf("Valor em reais é R$ %.2f", valorConvertido);
    	    break;
	        
	      case 3: // real pra euro
	        valorConvertido = valorBase / 6.25;
    	    System.out.printf("Valor em euros é R$ %.2f", valorConvertido);
    	    break;
	      
	      case 4: 
	        break;
	        
	     default:
	        System.out.println("Valor invalido!");
	        break;
	    }
	    
  		System.out.println("\n 1 - Real para Dólar \n 2 - Dólar para Real \n 3 - Real para Euro \n 4 - Sair");
  		opcaoEscolhida = scan.nextInt();
	    
	  } while(opcaoEscolhida != 4);

	  scan.close();
	}
}