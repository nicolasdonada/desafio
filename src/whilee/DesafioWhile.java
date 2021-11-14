
package src.whilee;

import java.util.Scanner;

public class DesafioWhile
{
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  double saldo = 0;
	  double saque = 0;
	  double deposito = 0;
	  String opcao;
	  
	  do{
	    System.out.println("Opções: \n (a) consulta saldo \n (b) saque \n (c) depósito \n (d) sair");
	    opcao = scan.next();
	    
	    switch(opcao){
	      case "a":
	        System.out.println("Seu saldo é " + saldo);
	        break;
	        
	      case "b": 
	        System.out.println("Quanto você quer sacar?");
	        saque = scan.nextDouble();
	        saldo = saldo - saque;
	        break;
	        
	      case "c": 
	        System.out.println("Quanto você quer depositar? ");
	        deposito = scan.nextDouble();
	        saldo = saldo + deposito;
	        break;
	        
	      case "d":
	        break;
	        
	      default:
	        System.out.println("Opção invalida!");
			
	    };
	    
	    saque = 0;
	    deposito = 0;
	
	 } while(!opcao.equals("d"));
	  scan.close();
	}
}