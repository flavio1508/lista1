package Exercio;

import java.util.Scanner;

public class Exercicio14 { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();
        System.out.println("Sua senha atual é: " + senha);

        leitor.close();
    }
    
}
