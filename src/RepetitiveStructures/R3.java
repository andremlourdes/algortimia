package RepetitiveStructures;

import java.util.Scanner;
public class R3
{public static void main(String[] args) throws Exception
{int A, B;
    Scanner LerS = new Scanner(System.in);
    do
    {System.out.print("Limite inferior ");
        A=LerS.nextInt();
        System.out.print("Limite superior ");
        B=LerS.nextInt();}
    while (A>B);
    if (A%2==0)
        A++;
    for (int Impar=A; Impar<=B; Impar+=2)
        System.out.println(Impar);}}
