package functionsProcedures;

import java.util.Scanner;
public class FP6
{static void Triplo(int A)
{A=3 * A;}
    public static void main(String[] args) throws Exception
    {int A;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um número ");
        A=LerS.nextInt();
        Triplo(A);
        System.out.printf("Triplo do número=%d", A);}}
