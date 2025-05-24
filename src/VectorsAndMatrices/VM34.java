package VectorsAndMatrices;

import java.util.Scanner;
public class VM34
{public static void main(String[] args) throws Exception
{int N, Meio;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Altura do triângulo? ");
    N = LerS.nextInt();
    long[][] T=new long [N][N*2+1];
    Meio = (0 + 2*N ) / 2;
    T[0][Meio] = 1;
    for (int I = 1; I <= Meio-1; I++)
    {for ( int J=Meio-I; J<=Meio+I; J=J+2)
        T[I][J] = T[I-1][J-1]+T[I-1][J+1]; }
    for (int I = 0; I <=Meio-1; I++)
    {System.out.println();
        for ( int J = 0; J <= N*2; J++)
            if (T[I][J]!=0)
                System.out.format("%3d",T[I][J]);
            else
                System.out.printf("%3s"," ");}}}