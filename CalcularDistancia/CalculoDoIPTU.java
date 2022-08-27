package calculodoiptu;

import java.util.Scanner;

public class CalculoDoIPTU {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Ve, Aq, Mq, Vmq, IPTU;
        System.out.println("Informe o valor do metro quadrado da sua região: ");
        Vmq = input.nextDouble();
        System.out.println("Informe a % da alíquota da sua região: ");
        Aq = input.nextDouble();
        System.out.println("Informe a quantidade de metros quadrados da sua casa: ");
        Mq = input.nextDouble();
        Ve = Vmq * Mq;
        IPTU = (Ve / 100 * Aq);
        System.out.println("Valor total da sua casa: " + Ve + " RS$.");
        System.out.println("Valor que será pago no IPTU: " + IPTU + " RS$.");
    }
}