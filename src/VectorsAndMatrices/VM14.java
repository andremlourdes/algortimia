package VectorsAndMatrices;

import java.util.Scanner;

public class VM14 {
    public static void main(String[] args) throws Exception {
        int K, N, Indicemaior;
        double Temporaria;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Quantos números tem a lista? ");
        K = LerS.nextInt();
        double[] A = new double[K];
        N = K - 1;
        LerS = new Scanner(System.in);
        for (int I = 0; I <= N; I++) {
            System.out.printf("%d número? ", I + 1);
            A[I] = LerS.nextDouble();
        }
        for (int Pas = 0; Pas <= N - 1; Pas++) {
            Indicemaior = Pas;
            for (int I = Pas + 1; I <= N; I++) {
                if (A[I] > A[Indicemaior]) {
                    Indicemaior = I;
                }
            }
            if (Indicemaior != Pas) {
                Temporaria = A[Pas];
                A[Pas] = A[Indicemaior];
                A[Indicemaior] = Temporaria;
            }
        }
        System.out.println("\nLista ordenada por ordem decrescente:");
        for (int I = 0; I <= N; I++) {
            System.out.printf(String.format("%5.1f", A[I]));
        }
    }
}