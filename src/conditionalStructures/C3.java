package conditionalStructures;

import java.util.Scanner;
public class C3
{public static void main(String[] args) throws Exception
{double A, B;
    System.out.print("Digite o primeiro número: ");
    Scanner LerS = new Scanner(System.in);
    A=LerS.nextDouble();
    System.out.print("Digite o segundo número: ");
    B=LerS.nextDouble();
    if (A>B)
        System.out.println(A+" é o maior.");
    else if (B>A)
        System.out.println(B+" é o maior.");
    else
        System.out.println("Os dois números são iguais.");}}