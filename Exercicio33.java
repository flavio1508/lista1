import java.util.Scanner;

public class Exercicio33 { 
    public static void main(String[] args) {
        double saldo;
        Scanner leitor = new Scanner(System.in);
        saldo = leitor.nextDouble();
        System.out.println("Informe o saldo original " + saldo);
        System.out.println("O saldo reajustado é "+(saldo * 1.01));
    }
    
}
