package VectorsAndMatrices;

import java.util.Scanner;
public class VM18
{public static void main(String[] args) throws Exception
{int T, N, M;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Tamanho 1. dimensão ");
    T = LerS.nextInt();
    System.out.print("Tamanho 2. dimensão ");
    N = LerS.nextInt();
    System.out.print("Tamanho 3. dimensão ");
    M = LerS.nextInt();
    String[][][] A = new String[T][N][M];
    for (int P = 0; P <= T - 1; P++)
        for (int I = 0; I <= N - 1; I++)
            for (int J = 0; J <= M - 1; J++)
            {System.out.printf("A[%d,%d,%d]=",P, I, J);
                A[P][I][J]=LerS.next();}
    for (int P = 0; P <=T - 1; P++)
    {System.out.printf("Escola %d\n", P);
        for (int I = 0; I <= N - 1; I++)
        {for (int J = 0; J <= M - 1; J++)
            System.out.printf("%1$-12s", A[P][I][J]);
            System.out.println();}}}}