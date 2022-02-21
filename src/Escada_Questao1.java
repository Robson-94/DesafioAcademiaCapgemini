import java.util.Scanner;

public class Escada_Questao1 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite a quantidade de vezes que deseja: ");
       int num = entrada.nextInt();
       entrada.close();
       
       for (int i = 0; i < num; i++) {
                System.out.print("  ");
            
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");   
       }
    }          
}