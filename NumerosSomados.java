package numerossomados;
import java.util.Scanner;
public class NumerosSomados {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, cont = 0, calculo = 0, a = 0;
    System.out.print("Digite a quantidade de números a serem somados: ");
    n = input.nextInt();
        
    while(n <= 0) {
    System.out.print("Numero inválido! Digite novamente a quantidade de números a serem somados: ");
    n = input.nextInt();
    }
    
    a = n;
    
    while(cont != n) {
    calculo = a + calculo;
    a = a - 1;
    cont++;
    }
     System.out.print("A soma é: "+  calculo );
    }

}