package functionsProcedures;

import java.util.Scanner;
public class FP19
{public static void main(String[] args) throws Exception
{int X, N=10, I;
    int [] A= new int[N+1];
    String Perg;
    Scanner LerS= new Scanner(System.in);
    for (I=0; I<=N-1; I++)
        A[I]=200+100 *I+ 150;
    System.out.print("Enter the value you are looking for ");
    X=LerS.nextInt();
    System.out.print("Binary Search (Yes/...)?");
    Perg=LerS.next();
    if (Perg.compareToIgnoreCase("YES")!=0)
    {System.out.println("Linear Search");
        I= Search.LinearSearch(A, X);}
    else
    {System.out.println("Pesquisa Binaria");
        I= Search.LinearSearch(A, X);}
    if (I < N)
        System.out.printf("%d is the index element %d of the array", X,I);
    else
        System.out.printf("%d does not exist in the array!!", X);}}