package VectorsAndMatrices;

public class VM28
{public static void main(String[] args)
{double[][] A= { { 13, 21, 45, 63 }, { 5, 0, 10, 80 } };
    int N = A.length;
    int M = A[0].length;
    double[][] At = new double[M][N];
    int Ti = 0, Tj;
    for (int J = 0; J <= M - 1; J++)
    {Tj = 0;
        for (int I = 0; I <= N - 1; I++)
        {At[Ti][Tj] = A[I][J];
            Tj++;}
        Ti++;}
    for (Ti = 0; Ti <= M - 1; Ti++)
    {for (Tj = 0; Tj <= N - 1; Tj++)
        System.out.printf("%4.0f",At[Ti][Tj]);
        System.out.println();}}}