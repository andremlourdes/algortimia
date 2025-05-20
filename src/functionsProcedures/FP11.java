package functionsProcedures;

import java.util.Scanner;
public class FP11
{static void LeituraVetor(double[] A) throws Exception
{Scanner LerS= new Scanner(System.in);
    for (int I=0; I<=A.length-1; I++)
    {System.out.printf("Elemento %d=", I+1);
        A[I]=LerS.nextDouble();}}
    static double Media(double[] A)
    {double Soma=0;
        for (int I=0; I<=A.length-1; I++)
            Soma += A[I];
        return Soma/(A.length);}
    public static void main(String[] args) throws Exception
    {int N;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Quantos elementos tem o vetor? ");
        N=LerS.nextInt();
        double[] A=new double[N];
        LeituraVetor(A);
        System.out.print(String.format("Média aritmética=%4.1f",
                Media(A)));}}
