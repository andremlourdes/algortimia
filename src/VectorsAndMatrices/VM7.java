package VectorsAndMatrices;

import java.util.Scanner;

public class VM7 {
    public static void main(String[] args) throws Exception {
        int N, Indmax1 = 0, Indmax2 = 0;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Quantos elementos tem o vetor? ");
        N = LerS.nextInt();
        double[] A = new double[N];
        for (int I = 0; I <= N - 1; I++) {
            System.out.printf("Elemento %d ", I);
            A[I] = LerS.nextDouble();
        }
        for (int I = 1; I <= N - 1; I++) {
            if (A[I] >= A[Indmax1]) {
                Indmax2 = Indmax1;
                Indmax1 = I;
            } else if (A[I] >= A[Indmax2]) {
                Indmax2 = I;
            }
        }
        System.out.printf(String.format("O maior elemento %5.1f tem o índice %d\n", A[Indmax1], Indmax1));
        System.out.printf(String.format("O segundo maior elemento %5.1f tem o índice %d\n", A[Indmax2], Indmax2));
    }
}