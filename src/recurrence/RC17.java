package recurrence;

public class RC17
{public static int Maior (int[] A, int Inferior, int Superior) {
    int Meio, Esquerda, Direita;
    if (Inferior == Superior)
        return A[Inferior];
    else
    {Meio=(Inferior+Superior)/2;
        Esquerda=Maior(A, Inferior, Meio);
        Direita=Maior(A, Meio+1, Superior);
        if (Esquerda>Direita)
            return Esquerda;
        else
            return Direita;}}
    public static void main(String[] args)
    {int[] A={67, 1203, 89, 124, 12, 156};
        System.out.printf("Maior elemento=%d",
                Maior(A, 0,A.length-1));}}
