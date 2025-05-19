package functionsProcedures;

public class Search
{public static int LinearSearch(int[] A, int X)
{int I = 0;
    A[A.length - 1] = X;
    while (A[I] != X)
        I++;
    return I;}
    public static int Binary(int[] A, int X)
    {int Inf = 0, Sup = A.length - 1, M = 0;
        boolean Exito = false;
        while (Exito == false && Inf <= Sup)
        {M = (Sup + Inf) / 2;
            if (X > A[M])
                Inf = M + 1;
            else if (X < A[M])
                Sup = M - 1;
            else
                Exito = true;}
        if (Exito != true)
            M = A.length - 1;
        return M;}}