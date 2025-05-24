package errorsValidationsCorrections;

import java.util.Scanner;

public class EV9 {
    public static void main(String[] args) throws Exception {
        int N = 4;
        int[] A = new int[N];
        Scanner LerS = new Scanner(System.in);

        for (int I = 0; I <= N - 1; I++) {
            try {
                System.out.printf("Digite A[%d] ", I);
                A[I] = LerS.nextInt();
            } catch (Exception e2) {
                System.out.println("Caráter, string ou real - substituímos por 20");
                A[I] = 20;
            }
            try {
                if (A[I] < 0)
                    throw new Exception();
            } catch (Exception e1) {
                System.out.println("Negativo - substituímos por 10");
                A[I] = 10;
            } finally {
                System.out.println("Multiplicámos por 5");
                A[I] *= 5;
            }
        }

        System.out.println("\nVetor:");
        for (int I = 0; I <= N - 1; I++) {
            System.out.printf("A[%d] = %d\n", I, A[I]);
        }
    }
}