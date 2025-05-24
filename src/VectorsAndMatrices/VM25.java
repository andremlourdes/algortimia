package VectorsAndMatrices;

import java.util.Scanner;
public class VM25
{public static void main(String[] args) throws Exception
{int N,M, Linmin;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantas linhas tem a matriz? ");
    N = LerS.nextInt();
    System.out.print("Quantas colunas tem a matriz? ");
    M = LerS.nextInt();
    int[][] A = new int[N+1][M];
    for (int I = 0; I <= N - 1; I++)
        for (int J = 0; J <= M - 1; J++)
        {System.out.printf("A[%d,%d]=", I, J);
            A[I][J] = LerS.nextInt();}
    for (int J = 0; J <= M - 1; J++)
    {Linmin = 0;
        for (int I = 1; I <= N - 1; I++)
            if (A[I][J] < A[Linmin][J])
                Linmin = I;
        A[N][J] = A[Linmin][J];}
    for (int I=0; I<=N-1; I++)
    {for (int J = 0; J <= M - 1; J++)
        System.out.printf("%6d", A[I][J]);
        System.out.println();}
    for (int J = 0; J <= M - 1; J++)
        System.out.printf("%6s", "-");
    System.out.println();
    for (int J = 0; J <= M - 1; J++)
        System.out.printf("%6d", A[N][J]);
    System.out.println();}}