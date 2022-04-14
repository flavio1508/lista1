package Exercio;

import java.util.Scanner;

public class Exercicio9 { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            String entrada = leitor.next();
            int potencia = 0;
            int decimal = 0;
            for (int i = entrada.length() - 1; i >= 0; i--) {
                decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
                potencia++;
    
            }
            System.out.println("O binário convertido em decimal é: " + decimal);
    
    }
    
}
