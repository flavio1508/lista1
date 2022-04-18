public class Exercicio22 { 
    public static void main(String[] args) {
        int tempoTotal = 86399;
        int horas;
        int minutos;
        int segundos;

         minutos = (int) (tempoTotal / 60);
         segundos = tempoTotal % 60;
         horas = minutos / 60;
         minutos = minutos % 60;

         System.out.println(horas + ":" + minutos + ":" + segundos);
    }
    
}
