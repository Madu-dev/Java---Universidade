import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
	    
	    CalcularDistanciaDeDoisPontos calculoDistanciaDeDoisPontos = new CalcularDistanciaDeDoisPontos();
	    
	    System.out.println("Informe o valor de X1 e Y1 (informe ambos e entre eles coloque um espaço): ");
	    calculoDistanciaDeDoisPontos.setX1(in.nextDouble());
	    calculoDistanciaDeDoisPontos.setY1(in.nextDouble());
	    System.out.println(calculoDistanciaDeDoisPontos.getX1()+" , "+calculoDistanciaDeDoisPontos.getY1());

	    System.out.println("Informe o valor de X2 e Y2 (informe ambos e entre eles coloque um espaço): ");
	    calculoDistanciaDeDoisPontos.setX2(in.nextDouble());
	    calculoDistanciaDeDoisPontos.setY2(in.nextDouble());

	    System.out.println(calculoDistanciaDeDoisPontos.getX2()+" , "+calculoDistanciaDeDoisPontos.getY2());

	    calculoDistanciaDeDoisPontos.calcularDist();
	    
	  }
	}