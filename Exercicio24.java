import java.util.Scanner;

public class Exercicio24 { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        int numero1 = leitor.nextInt();
        System.out.println("informe o segundo numero");
        int numero2 = leitor.nextInt(); 

        if(numero1 > numero2){
            System.out.println("o valor é:" + numero1);
        } else {
            System.out.println("o valor é:" + numero2);
        } 
             if(numero1 == numero2){
            System.out.println("0");
        } else{ 
        if(numero1 %6 == numero2 %6 && numero1 > numero2){
            System.out.println("o valor é:" + numero1);
        } else {
            if(numero1 %6 == numero2 %6 && numero2 > numero1){
                System.out.println("o valor é:" + numero2);
            }
        }
        

    } 
    
}
 } 
    