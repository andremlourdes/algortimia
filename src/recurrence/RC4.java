package recurrence;

import java.util.Scanner;
public class RC4
{public static long Fatorial (int X)
{if (X==0)
    return 1;
else
    return X*Fatorial(X-1);}
    public static void main(String[] args)throws Exception
    {int N;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo ");
        N=LerS.nextInt();
        System.out.printf("Fatorial de %d!=%d", N, Fatorial(N));}}
