

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class Exercicio20 { 
    public static void main(String[] args) { 
        System.out.println("insira o valor do primeiro número:");
        Scanner leitor = new Scanner(System.in);
        int number1 = leitor.nextInt(); 
        System.out.println("insira o valor do sugundo número:");
        int number2 = leitor.nextInt();
        System.out.println("insira o valor do terceiro número:");
        int resutado = leitor.nextInt();
        
        if(number1 + number2 == resutado){
            System.out.println("true");
        } else{ 
            System.out.println("false");
        }

    }
    
}
