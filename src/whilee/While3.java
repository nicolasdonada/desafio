package src.whilee;

import java.util.Scanner;

public class While3 
{

    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite um numero inteiro:");
            int numero = scan.nextInt();

            int i = 1;
            int soma = 0;

            while(i <= numero)
           
            {
        soma = soma + i;

        i++;
            }

        System.out.println(soma);
        
    }
}
