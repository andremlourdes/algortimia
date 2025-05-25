package conditionalStructures;

import java.util.Scanner;
public class C10
{public static void main(String[] args) throws Exception
{double A, B, C;
    double Menor, Meio=0, Maior=0;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Digite o primeiro número ");
    A=LerS.nextDouble();
    System.out.print("Digite o segundo número ");
    B=LerS.nextDouble();
    System.out.print("Digite o terceiro número ");
    C=LerS.nextDouble();
    if (A>B)
    {if (A>C)
    {Maior=A;
        if (B>C)
        {Meio=B;
            Menor=C;}
        else
        {Meio=C;
            Menor=B;}}
    else
    {Maior=C;
        Meio=A;
        Menor=B;}}
    else
    {if (B>C)
    {Maior=B;
        if (A>C)
        {Meio=A;
            Menor=C;}
        else
        {Meio=C;
            Menor=A;}}
    else
    {Maior=C;
        Meio=B;
        Menor=A;}}
    System.out.println(Menor+"<"+ Meio+ "<"+ Maior);}}