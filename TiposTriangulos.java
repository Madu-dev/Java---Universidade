package tipostriangulos;

import java.util.Scanner;

public class TiposTriangulos {

    public static boolean formaçãoTriangulo(int retaA, int retaB, int retaC) {
        boolean retas;
        if ((retaA <= (retaB + retaC)) && (retaB <= (retaA + retaC)) && (retaC <= (retaB + retaA))) {
            retas = true;
        } else {
            retas = false;
        }
        return retas;
    }

    public static int IsoEscaEqui(int retaA, int retaB, int retaC) {
        int tipotriangulo = 0;

        // escaleno qnd tds os lados tem medidas diferentes

        if ((retaA != retaB && retaA != retaC && retaB != retaC)) {
            tipotriangulo = 1;

            // isósceles qnd dois lados tem a mesma medida

        } else if ((retaA != retaB && retaB == retaC) || (retaB != retaC && retaA == retaB)) {
            tipotriangulo = 2;

            // equilátero qnd todos os lados tem a mesma medida

        } else if (retaA == retaB && retaB == retaC && retaC == retaA) {
            tipotriangulo = 3;
        }
        return tipotriangulo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int retaA, retaB, retaC, tipotriangulo;
        boolean trueFalse;

        System.out.println("Digite 3 valores de retas para formar um tipo de triângulo. ");
        System.out.println("reta A: ");
        retaA = scanner.nextInt();

        while (retaA < 1) {
            System.out.println("Valor inválido. Digite um número maior que 0: ");
            retaA = scanner.nextInt();
        }

        System.out.println("reta B: ");
        retaB = scanner.nextInt();

        while (retaB < 1) {
            System.out.println("Valor inválido. Digite um número maior que 0: ");
            retaB = scanner.nextInt();
        }

        System.out.println("reta C: ");
        retaC = scanner.nextInt();

        while (retaC < 1) {
            System.out.println("Valor inválido. Digite um número maior que 0: ");
            retaC = scanner.nextInt();
        }

        trueFalse = formaçãoTriangulo(retaA, retaB, retaC);

        if (trueFalse == true) {

            tipotriangulo = IsoEscaEqui(retaA, retaB, retaC);

            if (tipotriangulo == 1) {
                System.out.println("O triângulo formado é escaleno");
            }

            else if (tipotriangulo == 2) {
                System.out.println("O triângulo formado é isósceles");
            }

            else if (tipotriangulo == 3) {
                System.out.println("O triângulo formado é equilátero");
            }

            else {
                System.out.println("Não tem como formar algum triângulo.");
            }
        }
    }
}