package functionsProcedures;

import java.util.Scanner;
public class FP10
{static void LeituraVetor(String[] A)throws Exception
{Scanner LerS= new Scanner(System.in);
    for (int I=0; I<=A.length-1; I++)
    {System.out.printf("Cidade %d=", I+1);
        A[I]=LerS.next();}}
    static void EscritaVetor(String[] A)
    {for (int I=0;I<=A.length-1; I++)
        System.out.print(A[I]+"\n");}
    public static void main(String[] args)throws Exception
    {int N;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Quantas cidades há? ");
        N=LerS.nextInt();
        String[] A=new String[N];
        LeituraVetor(A);
        EscritaVetor(A);}}