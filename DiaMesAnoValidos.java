/*Programa que solicita ao usuário três números inteiros: um representando um dia, outro representando um mês e um terceiro representando um ano.
O programa deverá decidir se juntos os três números formam uma data válida. OBS1: Só aceite ano maior ou igual a 1900.*/

package diamesanovalidos;

import java.util.Scanner;

public class DiaMesAnoValidos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mês, ano;

        System.out.println("Digite a data");

        System.out.print("Dia: ");
        dia = input.nextInt();

        System.out.print("Mês: ");
        mês = input.nextInt();

        System.out.print("Ano: ");
        ano = input.nextInt();

        if ((dia >= 1 && dia <= 31) && (mês >= 1 && mês <= 12) && (ano >= 1900)) {
            System.out.println(" || A data é válida || ");
        } else {
            System.out.print(" || A data é inválida || ");
        }
    }
}