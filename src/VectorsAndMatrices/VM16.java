package VectorsAndMatrices;

import java.util.Scanner;
import java.util.Scanner;
public class VM16
{public static void main(String[] args) throws Exception
{int N, M;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantas linhas tem a matriz? ");
    N=LerS.nextInt();
    System.out.print("Quantas colunas tem a matriz? ");
    M=LerS.nextInt();
    int [][] A=new int[N][M];
    for (int I=0; I<=N-1; I++)
        for (int J=0; J<=M-1; J++)
        {System.out.printf("Elemento A [%d,%d]? ", I, J );
            A[I][J]= LerS.nextInt();}
    System.out.println();
    for (int I=0; I<=N-1; I++)
    {for (int J=0; J<=M-1; J++)
        System.out.printf("%4d",A[I][J]);
        System.out.println();}}}