package functionsProcedures;

import java.util.Scanner;
public class FP14
{static void Lermatriz(int[][] A) throws Exception
{Scanner LerS= new Scanner(System.in);
    {for (int I=0; I<=A.length-2; I++)
        for (int J=0; J<=A[0].length-2; J++)
        {System.out.printf("Elemento A [%d,%d]? ", I, J);
            A[I][J]=LerS.nextInt();}}}
    static void Somarlinhas(int [][] A)
    {int Total;
        for (int I=0; I<=A.length- 2; I++)
        {Total=0;
            for (int J=0; J<=A[0].length-2; J++)
                Total += A[I][J];
            A[I][A[0].length-1]=Total;}}
    static void Somarcolunas(int [][] A)
    {int Total;
        for (int J=0; J<=A[0].length- 2; J++)
        {Total=0;
            for (int I=0; I<=A.length-2; I++)
                Total += A[I][J];
            A[A.length-1][J]=Total;}}
    static void Escrevermatriz(int[][] A)
    {for (int I=0; I<=A.length-1; I++)
    {for (int J=0; J<=A[0].length-1; J++)
    {if (I!=A.length-1 || J!=A[0].length-1)
        System.out.printf("%5d",A[I][J]);}
        System.out.println();}}
    public static void main(String[] args) throws Exception
    {int N, M;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Quantas linhas tem a matriz? ");
        N=LerS.nextInt();
        System.out.print("Quantas colunas tem a matriz? ");
        M=LerS.nextInt();
        int[][] A=new int[N+1][M+1];
        Lermatriz(A);
        Somarlinhas(A);
        Somarcolunas(A);
        Escrevermatriz(A);}}
