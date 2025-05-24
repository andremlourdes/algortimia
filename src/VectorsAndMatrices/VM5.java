package VectorsAndMatrices;

import java.util.Scanner;
public class VM5
{public static void main(String[] args)throws Exception
{int N;
    double Med=0;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantos elementos tem o vetor? ");
    N=LerS.nextInt();
    double[] A=new double[N];
    for (int I=0; I <= N - 1; I++)
    {System.out.printf("Elemento %d=", I + 1);
        A[I]=LerS.nextDouble();}
    for (int I=0; I<=N-1 ; I++)
        Med+=A[I];
    Med=Med / N;
    System.out.printf(String.format("Média aritmética=%5.2f",
            Med));}}
