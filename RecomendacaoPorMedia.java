package recomendacaopormedia;

import java.util.Scanner;

public class RecomendacaoPorMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double média;

        System.out.print("Digite a média do aluno: ");
        média = input.nextDouble();

        if (média >= 9) {
            System.out.println(" || Altamente recomendado || ");
        } else if (média >= 8) {
            System.out.print(" || Fortemente recomendado || ");
        } else if (7 == média) {
            System.out.print(" || Recomendado || ");

        } else {
            System.out.print(" || Não Recomendado || ");
        }
    }
}