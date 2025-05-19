package functionsProcedures;

public class FP16
{static int[][] Multiplica(int[][] A, int[][] B )
{int Total=0;
    int[][] C=new int[A.length][B.length];
    for (int I=0; I<=A.length-1; I++)
    {for (int K=0; K<=B[0].length- 1; K++)
    {Total=0;
        for (int J=0; J<=A[0].length-1; J++)
            Total=Total+A[I][J] * B[J][K];
        C[I][K]=Total;}}
    return C;}
    public static void main(String[] args)
    {int[][] A={ { 1, 2, 3 }, { 4, 0, 2 } };
        int[][] B={ { 1, 0 }, { 2, 2 }, { 3, 3 } };
        int [][] C=Multiplica(A, B);
        for (int I=0; I<=A.length-1; I++)
        {for (int J=0; J<=B[0].length- 1; J++)
            System.out.printf("%4d", C[I][J]);
            System.out.println();}}}
