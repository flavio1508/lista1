import java.util.Scanner;

public class Exercicio27 { 
    public static void main(String[] args) {
        int numero = 4;
        int fator = 1;
        int resultado =1;
        int contador = 1;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o número fatorial: ");

        numero = leitor.nextInt();

        if (numero == 0) {
            System.out.println("O fatorial de 0 é 1");
        } else {
                for (int i = 1; i < numero; i++) {
                    fator *= contador;
                    resultado = numero * fator;
                    contador++;
                }
                contador -=1;
                System.out.println("O fatorial de " + numero + " é (" + contador + "!) * " + numero + " = " + resultado);

        }

        leitor.close();
}
 }