package RepetitiveStructures;

import java.util.Scanner;
public class R11
{public static void main(String[] args)throws Exception
{int N, div;
    boolean primo;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    N=LerS.nextInt();
    primo=true;
    div=2;
    while ((primo == true) && (div <= (int)Math.sqrt(N)))
    {if (N % div == 0)
        primo=false;
    else
        div++;}
    if (primo==true)
        System.out.println(N + " é primo");
    else
        System.out.println(N + " não é primo");}}