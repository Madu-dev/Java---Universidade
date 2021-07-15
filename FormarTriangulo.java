/* Programa que solicitar ao usuário o tamanho de três segmentos de
reta e verificar se, com eles, podemos formar um triângulo.*/

package formartriangulo;
import java.util.Scanner;
public class FormarTriangulo {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int ab, cd, ef;
    
    System.out.println("Digite o valor de AB: ");
    ab = input.nextInt();
    
    System.out.println("Digite o valor de CD: ");
    cd = input.nextInt();
    
    System.out.println("Digite o valor de EF: ");
    ef = input.nextInt();
    
    if(ab <= cd + ef) {

     System.out.println("É possivel formar um triângulo");
    }
    else if (cd < ab + ef ){
     System.out.println("É possivel formar um triangulo");
    }
    else if (ef < ab + cd ) {
        System.out.println(" Não é possivel formar um triângulo");
    }
    }  
}