package RepetitiveStructures;

import java.util.Scanner;

public class R30 {
    public static void main(String[] args) throws Exception {
        double Medg = 1, F, Taxa, N = 0;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Taxa de crescimento anual % (99 para terminar) ");
        Taxa = LerS.nextDouble();
        while (Taxa != 99) {
            N++;
            F = 1 + Taxa / 100;
            Medg *= F;
            System.out.print("Taxa de crescimento anual % (99 para terminar) ");
            Taxa = LerS.nextDouble();
        }
        Medg = (Math.pow(Medg, 1 / N) - 1) * 100;
        System.out.print(String.format("Taxa média anual de crescimento nos %d anos=%5.2f%c", (int) N, Medg, '%'));
    }
}