/* A empresa XYZ Ltda. concedeu uma gratificação de 20% do valor do salário a todos os funcionários com tempo de serviço na
empresa igual ou superior a dez anos e de 10% aos demais. Implemente um programa para solicitar ao usuário o tempo do serviço e o
salário de um funcionário e calcular e exibir o valor da gratificação que ele irá receber. */

package gratificacaosalario;
import java.util.Scanner;
public class GratificacaoSalario {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double salFun, valorGrati = 0, tps;
    
    
   System.out.println ("Digite o sálario do funcionário: ");
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