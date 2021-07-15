/*Para o cálculo do valor a ser pago na conta de energia segue-se a seguinte regra: caso a quantidade de
quilowatts mensais seja inferior a 10, o consumidor irá pagar a tarifa mínima que é de R$ 7,00. Se o consumo
for maior ou igual a 10 quilowatts, então o consumidor irá pagar R$ 1,40 por quilowatts. Todos os
consumidores pagam taxa de iluminação pública no valor de R$ 3,50, independente de seu consumo. Faça um
programa que solicite o consumo do cliente em quilowatts e informe qual será o valor da conta de energia.*/

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
  
