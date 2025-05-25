package RepetitiveStructures;

import java.util.Scanner;
public class R17
{public static void main(String[] args)throws Exception
{int X, X1, Y, Y1, T;
    Scanner LerS=new Scanner(System.in);
    System.out.print("Multiplicando ");
    X=LerS.nextInt();
    System.out.print("Multiplicador ");
    Y=LerS.nextInt();
    X1=X; Y1=Y; T=0;
    while (X1>=1)
    {if (X1%2!=0)
        T=T+Y1;
        X1=(X1/2);
        Y1=Y1*2;}
    System.out.printf("%d x %d= %d", X,Y,T);}}