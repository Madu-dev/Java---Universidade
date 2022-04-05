//programa que lê as coordenadas de mais cinco pontos e diz se está dentro ou fora da circunferência

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		 Circunferencia calcularCircunferencia = new Circunferencia();

		System.out.print("Digite a coordenada de X do ponto central: "); 
		calcularCircunferencia.setXPC(in.nextDouble()); 
		
		System.out.print("Digite a coordenada de Y do ponto central: "); 
		calcularCircunferencia.setYPC(in.nextDouble());

		System.out.print("Digite o raio: ");
		calcularCircunferencia.setRaio(in.nextDouble());

		for(int i = 0; i < 5; i++){
		      System.out.print("Digite a ("+(i+1)+"ª)+ coordenada de X: ");
		      calcularCircunferencia.setXPComp(in.nextDouble());
		      
		      System.out.print("Digite a ("+(i+1)+"ª)+ coordenada de Y: ");
		      calcularCircunferencia.setYPComp(in.nextDouble());
		      calcularCircunferencia.calcularDistanciaEntreDoisPontos();
		  }  
}
}