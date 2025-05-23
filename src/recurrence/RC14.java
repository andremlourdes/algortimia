package recurrence;

public class RC14
{public static void ImpressaoInversa(int[] A, int I)
{if (I < 0)
    System.out.println();
else
{System.out.printf("%5d",A[I]);
    ImpressaoInversa(A, I-1);}}
    public static void main(String[] args)
    {int[] A = { 35, 45, 23, 78, 90, 65, 78, 90, 76, 34, 25, 100 };
        int N = A.length;
        ImpressaoInversa(A,N-1);}}
