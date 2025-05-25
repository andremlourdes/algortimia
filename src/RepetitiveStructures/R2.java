package RepetitiveStructures;

import java.util.Scanner;
public class R2
{public static void main(String[] args) throws Exception
{int N, Soma=0;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Limite superior do intervalo? ");
    N=LerS.nextInt();
    for (int I=1;I<=N;I++)
        Soma+=I;
    System.out.printf("Total da adição dos %d inteiros=%d",
            N,Soma);}}