package src.ifelse;

import java.util.Scanner;

public class Calculadora
{
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	  
    System.out.println("Primeiro valor:");
    int primeiroValor = scan.nextInt();	
	  
	  System.out.println("Segundo valor:");
	  int segundoValor = scan.nextInt();
	  
	  System.out.println("Operações:\n 1. Soma\n 2. Subtração\n 3. Divisão\n 4. Multiplicação");
	  System.out.println("Digite o numero do operador que deseja:");
	  int operador = scan.nextInt();
	  
	  
	  if(operador == 1){
	    int soma = primeiroValor+segundoValor;
	    System.out.println("A soma de " + primeiroValor + " e " + segundoValor + " é " + soma);
	  } else if (operador == 2) {
	    int sub = primeiroValor-segundoValor;
	    System.out.println("A subtração de " + primeiroValor + " e " + segundoValor + " é " + sub);
	  } else if ( operador == 3) {
	    int div = primeiroValor/segundoValor;
	    int mod = primeiroValor%segundoValor;
	    System.out.println("A divisão de " + primeiroValor + " e " + segundoValor + " é " + div);
	    System.out.println("O mod de " + mod);
	  } else {
	    int multi = primeiroValor*segundoValor;
	    System.out.println("A multiplicação de " + primeiroValor + " e " + segundoValor + " é " + multi);
	  }

      scan.close();
	}
}
