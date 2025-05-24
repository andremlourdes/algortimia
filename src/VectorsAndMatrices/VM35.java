package VectorsAndMatrices;

import java.util.Scanner;
public class VM35
{public static void main(String[] args) throws Exception
{int N, Total=0, Lincorr = 0, Linprox = 0, Colcorr,Colprox=0,
        Z=1;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Dimensão do quadrado (n.ímpar)? ");
    N = LerS.nextInt();
    if (N % 2 == 0)
        N++;
    int[][] Quad = new int[N][N];
    Colcorr = (0 + N - 1) / 2;
    Quad[Lincorr][Colcorr] = Z;
    for (Z = 2; Z <= N * N; Z++ )
    {Linprox = Lincorr - 1;
        if (Linprox < 0)
            Linprox = N - 1;
        Colprox = Colcorr - 1;
        if (Colprox < 0)
            Colprox = N - 1;
        if (Quad[Linprox][Colprox] != 0)
            Linprox++;
        Lincorr = Linprox;
        Colcorr = Colprox;
        Quad[Lincorr][Colcorr] = Z;}
    for (Lincorr=0; Lincorr<=N- 1; Lincorr++)
    {for (Colcorr=0; Colcorr<=N - 1; Colcorr++)
    {if (Lincorr==Colcorr)
        Total += Quad[Lincorr][Colcorr];
        System.out.printf("%4d", Quad[Lincorr][Colcorr]);}
        System.out.println("");}
    System.out.printf("Total das linhas, colunas e "+
            "diagonais=%d", Total);}}