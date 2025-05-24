package VectorsAndMatrices;

public class VM6
{public static void main(String[] args)
{int [] A={4, 2, 5, 4, 3, 5, 2, 2, 4};int N= A.length-1;
    int [] Conta= new int[N+1];
    for (int I=0; I<=N-1; I++)
        Conta[I]=1;
    for (int I=0; I<N-1;I++)
    {if (Conta[I]!=0)
    {for (int J=I+1; J<=N; J++)
    {if (A[I]==A[J])
    {Conta[I]++;
        Conta[J]=0;}}}}
    for (int I=0; I<=N; I++)
        if (Conta[I]!=0)
            System.out.printf(" %d ocorre %d vez(es) em A\n",
                    A[I],Conta[I]);}}