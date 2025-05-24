package VectorsAndMatrices;

import java.util.Scanner;
public class VM21
{public static void main(String[] args) throws Exception
{int N, M, Total;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantas linhas tem a matriz? ");
    N=LerS.nextInt();
    System.out.print("Quantas colunas tem a matriz? ");
    M=LerS.nextInt();
    int [][] A=new int[N][M+1];
    for (int I=0; I<=N-1; I++)
        for (int J=0; J<=M-1; J++)
        {System.out.printf("Elemento a [%d,%d]? ", I, J );
            A[I][J]=LerS.nextInt();}
    for (int I=0; I<=N-1; I++)
    {Total=0;
        for (int J=0; J<=M-1; J++)
            Total+=A[I][J];
        A[I][M]=Total;}
    for (int I=0; I<=N-1; I++)
    {for (int J=0; J<=M-1; J++)
        System.out.printf("%6d", A[I][J]);
        System.out.printf("|%6d\n", A[I][M]);}}}