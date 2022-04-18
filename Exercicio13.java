

public class Exercicio13 { 
    public static void main(String[] args) { 
        int contador = 0;
        for (int i = 2; i <= 4; i++){
            for(int j = 2; j <= 4; j++){
                for(int k = 4; k >= 2; k++){ 
                    if(i != j && i !=k && j != k ){ 
                    System.out.println("" + i + j + k);
                    contador += 1; // contador = contador + 1

                }
            }
            System.out.println("o número total é:" + contador);
        }
        
    }
    
}
 }