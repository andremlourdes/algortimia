package VectorsAndMatrices;

import java.util.Scanner;

public class VM23 {
    public static void main(String[] args) throws Exception {
        int N, M, Linmax = 0, Colmax = 0;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Quantas linhas tem a matriz? ");
        N = LerS.nextInt();
        System.out.print("Quantas colunas tem a matriz? ");
        M = LerS.nextInt();
        double[][] A = new double[N][M];
        for (int I = 0; I <= N - 1; I++) {
            for (int J = 0; J <= M - 1; J++) {
                System.out.printf("A[%d,%d]=", I, J);
                A[I][J] = LerS.nextDouble();
            }
        }
        for (int I = 0; I <= N - 1; I++) {
            for (int J = 0; J <= M - 1; J++) {
                if (A[I][J] > A[Linmax][Colmax]) {
                    Linmax = I;
                    Colmax = J;
                }
            }
        }
        System.out.printf(String.format("Maior elemento:%5.1f\n", A[Linmax][Colmax]));
        System.out.printf("Índice da linha %d\n", Linmax);
        System.out.printf("Índice da coluna %d\n", Colmax);
    }
}