import java.util.Scanner;

public class Exercicio35 { 
    public static void main(String[] args) {  
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o salario minimo:");
        int sam = leitor.nextInt();
        System.out.println("informe o seu salario:");
        int sal = leitor.nextInt();
        double resultado = sal / sam;
        System.out.println("você recebe" + String.format("%2f", resultado) + " " + "salario minimo"); 
        leitor.close();

    }
    
}
