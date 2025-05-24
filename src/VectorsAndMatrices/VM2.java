package VectorsAndMatrices;

import java.util.Scanner;
public class VM2
{public static void main(String[] args)throws Exception
{int I=0, N, Numero;
    int[] A=new int[100];
    Scanner LerS= new Scanner(System.in);
    System.out.print("Digite um número (999 para terminar) ");
    Numero=LerS.nextInt();
    while (Numero != 999)
    {A[I]=Numero;
        I++;
        System.out.print("Digite um número (999 para terminar) ");
        Numero=LerS.nextInt();}
    N=I-1;
    for (I=0; I<=N ; I++)
        System.out.printf("%3d", A[I]);
    System.out.println();}}
