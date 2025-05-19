package functionsProcedures;

import java.util.Scanner;
public class FP12
{static void Leitura(int[] A) throws Exception
{Scanner LerS= new Scanner(System.in);
    for (int I=0; I<=A.length-1; I++)
    {System.out.printf("Número %d=", I+1);
        A[I]=LerS.nextInt();}}
    static void Contagem(int[] A, int[] Conta)
    {for (int I=0; I<=A.length-2;I++)
        if (Conta[I]!=0)
            for (int J=I+1; J<=Conta.length-1; J++)
                if (A[I]==A[J])
                {Conta[I]++;
                    Conta[J]=0;}}
    static void Escrita(int[] A, int[] Conta)
    {for (int I=0; I<=Conta.length-1; I++)
        if (Conta[I]!=0)
            System.out.printf("%d ocorre %d vez(es) no vetor\n", A[I],
                    Conta[I]);}
    public static void main(String[] args)throws Exception
    {int[] A=new int[7];
        int [] Conta=new int[7];
        for (int I=0; I<=A.length-1; I++)
            Conta[I]=1;
        Leitura(A);
        Contagem(A, Conta);
        Escrita(A, Conta);}}