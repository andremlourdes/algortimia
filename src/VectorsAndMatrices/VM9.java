package VectorsAndMatrices;

import java.util.Scanner;

public class VM9 {
    public static void main(String[] args) throws Exception {
        int N;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Quantos elementos tem cada vetor? ");
        N = LerS.nextInt();
        double[] A = new double[N];
        double[] B = new double[N];
        double[] Total = new double[N];
        double[] Prod = new double[N];
        for (int I = 0; I <= N - 1; I++) {
            System.out.printf("Elemento A[%d]=", I);
            A[I] = LerS.nextDouble();
        }
        for (int I = 0; I <= N - 1; I++) {
            System.out.printf("Elemento B[%d]=", I);
            B[I] = LerS.nextDouble();
        }
        for (int I = 0; I <= N - 1; I++) {
            Total[I] = A[I] + B[I];
            Prod[I] = A[I] * B[I];
        }
        System.out.println("Adição e produto dos elementos dos dois vetores:");
        for (int I = 0; I <= N - 1; I++) {
            System.out.printf(String.format("%2.1f + %2.1f=%3.1f\t", A[I], B[I], Total[I]));
            System.out.printf(String.format("%2.1f * %2.1f=%3.1f\n", A[I], B[I], Prod[I]));
        }
    }
}