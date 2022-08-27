/*um programa para ler N números inteiros maiores que zero e calcular e
exibir a soma dos números lidos. No programa, N (que representa a quantidade de
números a serem lidos) é um valor informado pelo usuário.
OBS: Para ser válido, N deve ser maior que zero. O programa deve forçar que o usuário
informe um valor de N válido.*/

package numerossomados2;

import java.util.Scanner;

public class NumerosSomados2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0, val, soma = 0, numLidos;

        System.out.print("Qual é a quantidade de números a serem lidos? ");
        numLidos = input.nextInt();

        while (numLidos <= 0) {
            System.out.println("Quantidade inválida! Digite novamente.");
            System.out.print("Qual é a quantidade de números a serem lidos? ");
            numLidos = input.nextInt();
        }

        while (cont != numLidos) {
            System.out.print("Digite um valor: ");
            val = input.nextInt();
            while (val < 0) {
                System.out.print("Valor inválido! Digite novamente um valor: ");
                val = input.nextInt();
            }
            soma = val + soma;
            cont++;
        }
        System.out.print("A soma de todos os nímeros é: " + soma);
    }
}