package recurrence;

import java.util.Scanner;
public class RC22
{private static void PreencheQuad(int[][] Quadro,int N,int I,int
        J)
{int N2=(int) Math.pow(N, 2);
    if (I>=0)
    {if (J>=0)
    {Quadro[I][J] = (I*N + I/N + J) % N2 + 1;
        PreencheQuad(Quadro, N, I, J-1);}
    else
        PreencheQuad(Quadro, N, I-1, N2);}}
    public static void main(String[] args)
    {int N;
        Scanner LerS=new Scanner(System.in);
        System.out.print("Digite o número de linhas da matriz: ");
        N=LerS.nextInt();
        int[][] Quadro = new int[N*N+1][N*N+1];
        int N2=(int) Math.pow(N, 2);
        PreencheQuad(Quadro, N, N2, N2);
        for (int I = 0; I < N*N; I++)
        {for (int J = 0; J < N*N; J++)
            System.out.printf("|%3d", Quadro[I][J]);
            System.out.print("|\n"); }}}