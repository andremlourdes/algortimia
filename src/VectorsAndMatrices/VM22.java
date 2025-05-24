package VectorsAndMatrices;

import java.util.Scanner;
public class VM22
{public static void main(String[] args) throws Exception
{int N, M;
    double Total;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantas linhas tem a matriz? ");
    N=LerS.nextInt();
    System.out.print("Quantas colunas tem a matriz? ");
    M=LerS.nextInt();
    double [][] A=new double[N+1][M];
    for (int I=0; I<=N-1; I++)
        for (int J=0; J<=M-1; J++)
        {System.out.printf("Elemento a[%d,%d]? ", I, J);
            A[I][J]=LerS.nextDouble();}
    for (int J=0; J<=M-1; J++)
    {Total=0;
        for (int I=0; I<=N-1; I++)
            Total+=A[I][J];
        A[N][J]=Total;}
    System.out.println();
    for (int I=0; I<=N-1; I++)
    {for (int J = 0; J <= M - 1; J++)
        System.out.printf(String.format("%6.1f", A[I][J]));
        System.out.println();}
    for (int J = 0; J <= M - 1; J++)
        System.out.printf(String.format("%6s", "-"));
    System.out.println();
    for (int J = 0; J <= M - 1; J++)
        System.out.printf(String.format("%6.1f", A[N][J]));
    System.out.println();}}