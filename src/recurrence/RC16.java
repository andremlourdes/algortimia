package recurrence;

public class RC16
{public static int Somatorio(int[] A, int I)
{int Total = 0;
    if (I == 0)
        return Total+= A[I];
    else
        return Total+=A[I]+Somatorio(A, I-1);}
    public static void main(String[] args)
    {int[] A = { 35, 45, 23, 78, 90, 65, 78, 90, 76, 34, 25, 100 };
        System.out.printf("Somatório dos elementos do vetor=%d",
                Somatorio(A, A.length-1));}}