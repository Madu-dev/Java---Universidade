import java.util.Scanner;
public class Formula {

	public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
	    int a, b, c;
	    double x1 = 0, x2 = 0,delta;
	   
	    System.out.println("Fórmula de bhaskara:");
	    System.out.println(" x = -b ± √b2 - 4ac / 2a");
	   
	    System.out.println();
	    System.out.print("Digite o valor de A: ");
	    a = in.nextInt();
	   
	    System.out.println();
	    System.out.print("Digite o valor de B: ");
	    b = in.nextInt();
	   
	    System.out.println();
	    System.out.print("Digite o valor de C: ");
	    c = in.nextInt();
	   
	    delta = ((b*b)-(4*a*c));
	    x1 = (-b + Math.sqrt(delta))/ (2*a);
	    x2 = (-b - Math.sqrt(delta))/ (2*a);
	   
	   
	        if (delta < 0) {
	         System.out.println("Não possui raiz real");
	    }
	     
	        if (delta == 0){
	         System.out.print("Apenas uma raiz " + x1); //resultado1
	    }
	        if (delta > 0) {
	          System.out.println("Duas raizes possiveis: "); // resultado1 + resultado 2
	          System.out.println("x1 =" + x1);
	          System.out.println("x2 =" + x2);
	    }
	 
	    }
	   
	}