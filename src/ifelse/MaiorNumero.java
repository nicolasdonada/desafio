package src.ifelse;

import java.util.Scanner;

public class MaiorNumero
{

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
    System.out.println("Adicione o primeiro numero: ");
    int primeiroNumero = scan.nextInt();

    System.out.println("Adicione o segundo numero: ");
    int segundoNumero = scan.nextInt();

    int maiorNumero = 0;
    
    if(primeiroNumero > segundoNumero){
      maiorNumero = primeiroNumero;
    } else if(segundoNumero > primeiroNumero) {
      maiorNumero = segundoNumero;
    } else {
      System.out.println("Os dois numeros são iguais!");
    }
    System.out.println("O maior numero entre " + primeiroNumero + " e " + segundoNumero + " é o numero " + maiorNumero);
	
    scan.close();
  }
}