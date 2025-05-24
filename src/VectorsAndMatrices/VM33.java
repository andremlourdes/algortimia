package VectorsAndMatrices;

public class VM33
{public static void main(String[] args)
{int K = 0;
    double[][] A = { { 1, 2, 3 }, { 3, 1, 4 }, { 0, 1, 2 } };
    double[][] Alg = new double[A.length][A[0].length + 2];
    double D=0, D1 = 0, D2 = 0, Prod;
    for (int I = 0; I <= A.length-1; I++)
    {K = 0;
        for (int J = 0; J <= A[0].length+1; J++)
        {if (K== A[0].length)
            K=0;
            Alg[I][J] = A[I][K];
            K++;}}
    for (int Dg = 0; Dg <= Alg.length-1; Dg++)
    {K = Dg;
        Prod = 1;
        for (int I = 0; I <=Alg.length-1; I++)
        {Prod = Prod * Alg[I][K];
            K++;}
        D1 += Prod;}
    for (int Dg = Alg[0].length-1; Dg>=Alg[0].length-3; Dg--)
    {K = Dg;
        Prod = 1;
        for (int I = 0; I <= Alg.length-1 ; I++)
        {Prod = Prod * Alg[I][K];
            K--;}
        D2 += Prod;}
    D = D1 - D2;
    System.out.printf(String.format("Determinante= %2.1f", D));}}