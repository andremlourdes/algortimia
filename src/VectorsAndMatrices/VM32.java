package VectorsAndMatrices;

public class VM32
{public static void main(String[] args)
{int[][] A = {{1,2,3},{4,0,2}};
    int N1 = A.length;
    int M1 = A[0].length;
    int[][] B = {{1,0},{2,2},{3,3}};
    int M2 = B[0].length;
    int[][] C = new int[N1][M2];
    int Total = 0;
    for (int I = 0; I <= N1-1 ; I++)
    {for (int K = 0; K <= M2-1; K++)
    {Total = 0;
        for (int J = 0; J <= M1-1; J++)
            Total = Total + A[I][J] * B[J][K];
        C[I][K] = Total;}}
    for (int I = 0; I <= N1-1; I++)
    {for (int J = 0; J <= M2-1; J++)
        System.out.printf("%4d", C[I][J]);
        System.out.println();}}}