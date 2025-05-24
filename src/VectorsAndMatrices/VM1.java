package VectorsAndMatrices;

import java.util.Scanner;
public class VM1
{public static void main(String[] args)throws Exception
{int N;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantos elementos tem o vetor? ");
    N=LerS.nextInt();
    int[] A=new int[N];
    for (int I=0; I <= N - 1; I++)
    {System.out.printf("Elemento %d=", I + 1);
        A[I]=LerS.nextInt();}
    for (int I=0; I<N ; I++)
        System.out.printf("%3d ", A[I]);
    System.out.println();}}