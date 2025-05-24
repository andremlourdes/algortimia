package VectorsAndMatrices;

import java.util.Scanner;
public class VM24
{public static void main(String[] args) throws Exception
{int N, M, Colmax;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantas linhas tem a matriz? ");
    N = LerS.nextInt();
    System.out.print("Quantas colunas tem a matriz? ");
    M = LerS.nextInt();
    double[][] A = new double[N][M + 1];
    for (int I = 0; I <= N - 1; I++)
        for (int J = 0; J <= M - 1; J++)
        {System.out.printf("A[%d,%d]=", I, J);
            A[I][J] = LerS.nextDouble();}
    for (int I = 0; I <= N - 1; I++)
    {Colmax = 0;
        for (int J = 1; J <= M - 1; J++)
            if (A[I][J] > A[I][Colmax])
                Colmax = J;
        A[I][M] = A[I][Colmax];}
    for (int I = 0; I <= N - 1; I++)
    {for (int J = 0; J <= M - 1; J++)
        System.out.printf("%5.0f", A[I][J]);
        System.out.printf("|%5.0f\n", A[I][M]);}}}
