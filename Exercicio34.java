import java.util.Scanner;

public class Exercicio34 { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o valor do IPI:");
        int IPI = leitor.nextInt();
        System.out.println("informe o valor da peça 1:");
        double peça1 = leitor.nextInt();
        System.out.println("informe a quantidade da peça 1:");
        int quantidade1 = leitor.nextInt();
        System.out.println("informe a quatidade da peça 2:");
        int quantidade2 = leitor.nextInt();
        System.out.println("informe o valor da peça 2");
        int peça2 = leitor.nextInt();

        double resultado = ((peça1 * quantidade1) + (peça2 * quantidade2))*((IPI/100) + 1);
        System.out.println("o valor é:" + resultado);
    }
    
}
