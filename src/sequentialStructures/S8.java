package sequentialStructures;

import java.util.Scanner;

public class S8 {
    public static void main(String[] args) throws Exception {
        final double Aumento = 20;
        double D1, D2, D3, D4, Dmedia;

        System.out.print("Digite a despesa do primeiro dia -> ");
        Scanner LerS = new Scanner(System.in);
        D1 = LerS.nextDouble();
        D2 = D1 * (1 + Aumento / 100);
        D3 = D2 * (1 + Aumento / 100);
        D4 = D3 * (1 + Aumento / 100);
        Dmedia = (D1 + D2 + D3 + D4) / 4;

        System.out.printf(String.format("Despesa média diária = %6.2f euros", Dmedia));
    }
}