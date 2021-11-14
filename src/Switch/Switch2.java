package src.Switch;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
		System.out.println("Digite o valor total da compra:");
		double valorTotal = scan.nextDouble();
		
		System.out.println("Digite seu condigo de identificação:");
		System.out.println(" 1. Cliente comum \n 2. Funcionário  \n 3. Cliente vip");
		int codIndentifica = scan.nextInt();
		
		int descontoFuncionario = 10;
		int descontoVip = 5;
		double valorComDesconto = 0;
		boolean identificado = false;
		
		switch(codIndentifica){
		  case 1:
		    valorComDesconto = valorTotal;
		    identificado = true;
		    break;
		  case 2:
		    valorComDesconto = valorTotal - (valorTotal*descontoFuncionario)/100;
		    identificado = true;
		    break;
		  case 3:
		    valorComDesconto = valorTotal - (valorTotal*descontoVip)/100;
		    identificado = true;
		    break;
		  default:
	  		System.out.println("Codigo de identificação invalido!");
        break;
		}
		
		if (identificado) 
		  System.out.println("Valor total a ser pago: R$" + valorComDesconto);

		  scan.close();
	}
}

