package functionsProcedures;

import java.util.Scanner;
public class FP18
{public static void main(String[] args) throws Exception
{int X, N=10, I;
    int [] A= new int[N+1];
    Scanner LerS= new Scanner(System.in);
    for (I=0; I<=N-1; I++)
        A[I]=200+100 *I+ 150;
    System.out.print("Digite o valor a procurar ");
    X=LerS.nextInt();
    I=Search.LinearSearch(A, X);
    if (I!=N)
        System.out.printf("%d é o elemento índice %d do vetor",X,I);
    else
        System.out.printf("%d não existe no vetor!!", X);}}