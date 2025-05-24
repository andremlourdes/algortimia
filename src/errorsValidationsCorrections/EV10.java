package errorsValidationsCorrections;

import java.util.Scanner;

public class EV10 {
    public static void main(String[] args) throws Exception {
        String Historico = "";
        int N = 4;
        int[] A = new int[N];
        Scanner LerS = new Scanner(System.in);
        for (int I = 0; I <= N - 1; I++) {
            try {
                System.out.printf("Digite A[%d] ", I);
                A[I] = LerS.nextInt();
            } catch (Exception e1) {
                Historico += "Caráter, string ou real";
                Historico += " - substituímos por 20\n";
                A[I] = 20;
            }
            try {
                if (A[I] < 0)
                    throw new Exception();
            } catch (Exception e2) {
                Historico += "Negativo - substituímos por 10\n";
                A[I] = 10;
            } finally {
                A[I] *= 5;
                Historico += "Multiplicámos por 5\n";
                Historico += " A[" + I + "] passa a ser " + A[I] + "\n";
            }
        }
        System.out.println(Historico);
    }
}