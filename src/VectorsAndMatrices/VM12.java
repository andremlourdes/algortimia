package VectorsAndMatrices;

import java.util.Scanner;

public class VM12 {
    public static void main(String[] args) throws Exception {
        int N = 7, Inf = 0, Sup = N - 1, M = 0;
        double[] A = {100, 110, 120, 140, 160, 200, 220};
        double X;
        boolean Exito = false;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Digite o valor a procurar ");
        X = LerS.nextDouble();
        while (Exito == false && Inf <= Sup) {
            M = (Sup + Inf) / 2;
            if (X > A[M])
                Inf = M + 1;
            else if (X < A[M])
                Sup = M - 1;
            else
                Exito = true;
        }
        if (Exito == true)
            System.out.print(String.format("%3.1f é o elemento índice %d do vetor\n", X, M));
        else
            System.out.print(String.format("%3.1f não existe no vetor!!\n", X));
    }
}