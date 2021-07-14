package condicionaissimples2b;
import java.util.Scanner;
public class CondicionaisSimples2B {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double salFun, valorGrati = 0, tps;
    
    
   System.out.println ("Digite o sálario do funcionário");
   salFun = input.nextDouble();
   
   System.out.println ("Informe o tempo de serviço do funcionário: ");
   tps = input.nextInt();
   
   if (tps >= 10) {
       valorGrati = salFun * 0.2;
   }
   else {
       valorGrati = salFun * 0.1;
   }
   System.out.println("O valor da gratificação é de: "+ valorGrati);
    }
    
}
