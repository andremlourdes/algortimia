package recurrence;

import java.util.Scanner;
public class RC6
{public static int MDC(int X, int Y)
{if (X == Y)
    return X;
else
if (X > Y)
    return MDC(X-Y, Y);
else
    return MDC(X, Y-X);}
    public static void main(String[] args)throws Exception
    {int X, Y;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um inteiro ");
        X= LerS.nextInt();
        System.out.print("Digite outro inteiro ");
        Y= LerS.nextInt();
        System.out.printf("MDC(%d, %d)=%d", X, Y, MDC(X,Y));}}