package VectorsAndMatrices;

import java.util.Scanner;
public class VM8
{public static void main(String[] args)throws Exception
{int N, Indmax=0 , Indmin=0;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantos elementos tem o vetor? ");
    N=LerS.nextInt();
    double[] A=new double[N];
    for (int I=0; I <= N - 1; I++)
    {System.out.printf("Elemento %d ", I);
        A[I]=LerS.nextDouble();}
    for (int I=1; I <= N - 1; I++)
    {if (A[I] < A[Indmin])
        Indmin=I;
    else if (A[I] > A[Indmax])
        Indmax=I;}
    System.out.printf(String.format("Maior elemento:%5.2f\n",
            A[Indmax]));
    System.out.printf(String.format("Menor elemento:%5.2f\n",
            A[Indmin]));}}