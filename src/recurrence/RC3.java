package recurrence;

import java.util.Scanner;
public class RC3
{static long AdicaoN (int N)
{if (N==0)
    return 0;
else
    return N+AdicaoN(N-1);}
    public static void main(String[] args)throws Exception
    {int N;
        long Total=0;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Maior inteiro a somar ");
        N=LerS.nextInt();
        Total = AdicaoN(N);
        System.out.printf("Total da adição dos %d primeiros "+
                "inteiros=%d", N, Total);}}
