package VectorsAndMatrices;

import java.util.Scanner;
public class VM30
{public static void main(String[] args) throws Exception
{int N;
    char Tipo;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Triangular superior (S) ou inferior (I)? ");
    Tipo=LerS.next().charAt(0);
    System.out.print("Número de linhas da matriz? ");
    N= LerS.nextInt();
    int[][] A = new int[N][N];
    if (Tipo=='i' || Tipo=='I')
    {for (int I = 0; I <= N - 1; I++)
        for (int J = 0; J <= I; J++)
        {System.out.printf("A[%d,%d] =", I, J);
            A[I][J] =LerS.nextInt();
            if (I!=J)
                A[J][I] = 0;}}
    else
    {for (int I = 0; I <= N - 1; I++)
        for (int J = N-1; J >= I; J--)
        {System.out.printf("A[%d,%d]=", I, J);
            A[I][J] = LerS.nextInt();
            if (I!=J)
                A[J][I] = 0;}}
    for (int I = 0; I <= N - 1; I++)
    {for (int J = 0; J <= N - 1; J++)
        System.out.printf( "%4d",A[I][J]);
        System.out.println();}}}