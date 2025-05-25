package RepetitiveStructures;

import java.util.Scanner;
public class R19
{public static void main(String[] args)throws Exception
{final double Taxa=2.5;
    int N;
    double Inicial, Meta, Acumu;
    System.out.print("Capital inicial? ");
    Scanner LerS=new Scanner(System.in);
    Inicial=LerS.nextInt();
    Meta=Inicial*1.2;Acumu=0;
    N=0;
    do
    {N++;
        Acumu=Inicial*Math.pow((1 + Taxa/100), N);}
    while (Acumu<=Meta);
    System.out.printf("%8.0f € ao fim de %d anos" ,Acumu, N);}}
