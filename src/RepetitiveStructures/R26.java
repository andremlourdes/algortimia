package RepetitiveStructures;

import java.util.Scanner;
public class R26
{public static void main(String[] args)throws Exception
{int X, Y, X1, Y1;
    Scanner LerS=new Scanner(System.in);
    System.out.print("x=");
    X=LerS.nextInt();
    System.out.print("y=");
    Y=LerS.nextInt();
    X1=X;
    Y1=Y;
    while (X1!=Y1)
    {if (X1>Y1)
        X1-=Y1;
    else
        Y1-=X1;}
    System.out.printf("m.d.c.(%d,%d)=%d", X,Y,X1);}}
