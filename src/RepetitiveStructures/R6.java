package RepetitiveStructures;

import java.util.Scanner;
public class R6
{public static void main(String[] args) throws Exception
{int L, C, N=9999;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Largura do retângulo ");
    L=LerS.nextInt();
    System.out.print("Comprimento do retângulo ");
    C=LerS.nextInt();
    System.out.println("");
    for (int Linha=1; Linha <= L; Linha++)
    {for (int Coluna=1; Coluna <= C; Coluna++)
    {N += 3;
        System.out.printf("%d", N); }
        System.out.println("");}}}