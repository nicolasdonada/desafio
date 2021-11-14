package src.whilee;

import java.util.Scanner;

public class While4 
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
    double numero = 0;
    do{
      System.out.println("Digite um numero maior que zero: ");
      numero = scan.nextDouble();

    } while(numero >= 0);

    scan.close();
        }
    
}