package functionsProcedures;

import java.util.Scanner;
public class FP17
{static void Ler(int[][] A)throws Exception
{Scanner LerS= new Scanner(System.in);
    for (int I=0; I<=A.length-1; I++)
        for (int J=0; J<=A[0].length-1; J++)
        {System.out.printf ("Digite o elemento A[%d,%d] ",I,J);
            A[I][J] =LerS.nextInt(); }}
    static void Escrever(int[][] A)
    {for (int I=0; I<=A.length-1; I++)
    {for (int J=0; J<=A[0].length-1; J++)
        System.out.printf("%4d", A[I][J]);
        System.out.println();}}
    static void Subtrair(int[][] A)
    {int Menor;
        for (int I=0; I<=A.length-1; I++)
        {Menor=MenorLinha(I, A);
            for (int J=0; J<=A[0].length-1; J++)
                A[I][J]-=Menor;}}
    static int MenorLinha(int I, int[][] A)
    {int Menor=0;
        for (int J=1; J<=A[0].length-1; J++)
            if (A[I][Menor] > A[I][J])
                Menor=J;
        return A[I][Menor];}
    public static void main(String[] args) throws Exception
    {int N=3;
        int[][] A=new int[N][N];
        Ler (A);
        Subtrair(A);
        Escrever(A);}}
