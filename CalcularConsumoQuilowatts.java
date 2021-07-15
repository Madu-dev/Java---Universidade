package calcularconsumoquilowatts;
import java.util.Scanner;
public class CalcularConsumoQuilowatts {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double qwt, consumo;
      
      
      System.out.print("Informe o valor do consumo em quilowatts: ");
      qwt = input.nextDouble();
      
      if (qwt < 10){
          consumo = 7 + 3.50;
          System.out.println("Consumo total é de " + consumo);
        }
      else if (qwt >= 10){
          consumo = 1.50+ 3.50;
          System.out.println("Consumo total é de " + consumo);
      }
      else {
          
      }
      
    }
    
}
  
