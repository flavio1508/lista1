import java.util.Scanner;

public class Exercico29 { 
    public static void main(String[] args) { 
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe um valor:");
        int x = leitor.nextInt();
        int y = 0;
        while(y != 1){
            if(x%2 == 0){
                y = x/2;
            } else {
                y = 3 * x + 1;
            }
            System.out.print(y+", ");
            x = y;
        }
 }
  }