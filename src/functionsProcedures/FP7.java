package functionsProcedures;

import java.util.Scanner;
public class FP7
{static int Triplo(int A)
{return A=3 * A;}
    public static void main(String[] args)throws Exception
    {int A;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um número ");
        A=LerS.nextInt();
        System.out.printf("Triplo do número=%d", Triplo(A));}}