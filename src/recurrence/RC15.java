package recurrence;

import java.util.Scanner;
public class RC15
{public static int Contagem(int[] A, int X, int I)
{int Conta = 0;
    if (I >=0)
    {if (A[I] < X)
        Conta++;
        Conta+= Contagem(A, X, I-1);}
    return Conta;}
    public static void main(String[] args) throws Exception
    {int N=12, X;
        int[] A = { 35, 45, 23, 78, 90, 65, 78, 90, 76, 34, 25, 100 };
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite o limite superior da contagem ");
        X=LerS.nextInt();
        System.out.printf("Número de elementos inferiores a %d=%d", X,
                Contagem(A,X,N-1));}}