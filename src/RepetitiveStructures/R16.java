package RepetitiveStructures;

import java.util.Scanner;
public class R16
{public static void main(String[] args)
{final char C='*';
    final char Espaco=' ';
    int A, Impar, Inicio;
    Scanner LerS=new Scanner(System.in);
    System.out.print("Número de linhas da árvore ");
    A=LerS.nextInt();
    Impar=1;
    Inicio=(int) ((A *2-1));
    for(int L=1; L<=A; L++)
    {for (int Esp=1; Esp<=Inicio; Esp++)
        System.out.print (Espaco);
        for (int Carat=1; Carat <= Impar; Carat++)
            System.out.print(C);
        System.out.println();
        Impar+=2;
        Inicio--;}}}