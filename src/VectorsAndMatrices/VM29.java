package VectorsAndMatrices;

import java.util.Scanner;
public class VM29
{public static void main(String[] args) throws Exception
{int N;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantas linhas tem a matriz? ");
    N=LerS.nextInt();
    int[][] A = new int[N][N];
    for (int I = 0; I <= N - 1; I++)
        for (int J = 0; J <=I; J++)
        {System.out.printf("A[%d,%d]=", I, J);
            A[I][J] = LerS.nextInt();
            if (I!=J)
                A[J][I]=A[I][J];}
    for (int I = 0; I <= N - 1; I++)
    {for (int J = 0; J <= N - 1; J++)
        System.out.printf("%5d", A[I][J]);
        System.out.println();}}}