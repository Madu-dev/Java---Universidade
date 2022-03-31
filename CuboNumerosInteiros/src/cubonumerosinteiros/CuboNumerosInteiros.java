package cubonumerosinteiros;
import java.util.Scanner;
public class CuboNumerosInteiros {

    public static void main(String[] args) {
   Scanner in= new Scanner(System.in);
    
    int número,cubo=0;

    for (número=1; número <=25; número++){
       System.out.print("Digite um número de 1 a 25: ");
       número=in.nextInt();

       cubo =número*número*número;
       
       System.out.println("O valor do cubo foi:" + cubo);
    }
    }
}
