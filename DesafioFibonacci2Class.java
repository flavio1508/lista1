public class DesafioFibonacci2Class { 
    public static void main(String[] args){
        Fibonacci fibo = new Fibonacci();
        int i = fibo.calculaFibonacci(6);
        System.out.println(i);
        }
        }
        
        class Fibonacci{
        int a=1;
        int b=1;
        int calculaFibonacci(int valor){
        for(int i=1; i<valor; i+=1){
        b=b+a;
        a=b-a;
        }
        return a;
        }
       
}
