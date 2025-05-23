package recurrence;

public class RC13
{public static void Impressao(int[] A, int I)
{System.out.printf("%d",A[I]);
    if (I ==A.length-1)
        System.out.println();
    else
    {System.out.print(",");
        Impressao(A, I+1);}}
    public static void main(String[] args)
    {int[] A = { 35, 45, 23, 78, 90, 65, 78, 90, 76, 34, 25, 100 };
        Impressao(A,0);}}
