package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner entrada = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuario: ");
        String usernamedigitada = entrada.nextLine();
        System.out.println("senha: ");
        String senhadigitada = entrada.nextLine();
        if(!usernameDB.equals(usernamedigitada) || !senhaDB.equals(senhadigitada)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }

        System.out.println("Usuario logado com Sucesso");
    }
}
