package src.ifelse;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String usuarioCorreto = "usuarioAutenticado123";
        String senhaCorreta = "senhaAutenticada123";
       
        System.out.println("Login:");
        String login = scan.next();

        System.out.println("Senha:");
        String senha = scan.next();

        if(!login.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
            System.out.println("LOGIN INCORRETO");
        }else if(login.equals(usuarioCorreto) && !senha.equals(senhaCorreta)){
            System.out.println("SENHA INCORRETA");
        }else if(!login.equals(usuarioCorreto) && !senha.equals(senhaCorreta)){
            System.out.println("ACESSO NEGADO");
        }else {
            System.out.println("ACESSO PERMITIDO ");
        }

        scan.close();
    }
}