

public class Exercicio7 { 
    public static void main(String[] args) {
        int x = 100, y = 200;
 
        System.out.println("Antes da troca");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int casa = x;
        x = y;
        y = casa;
 
        System.out.println("Após a troca");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}
