package recurrence;

import java.util.Scanner;

public class RC8 {
    public static double CapAcum(int Inicial, double Taxa, int N) {
        if (N == 0)
            return Inicial;
        else
            return CapAcum(Inicial, Taxa, N - 1) * (1 + Taxa);
    }

    public static void main(String[] args) throws Exception {
        int N, Inicial;
        double Taxa;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Capital inicial ");
        Inicial = LerS.nextInt();
        System.out.print("Taxa anual de juro (%) ");
        Taxa = Double.valueOf(LerS.next()) / 100;
        System.out.print("Duração da capitalização em anos ");
        N = LerS.nextInt();
        System.out.printf("%d euros capitalizados à taxa anual de %4.2f durante %d anos=%5.2f euros", Inicial, Taxa, N, CapAcum(Inicial, Taxa, N));
    }
}