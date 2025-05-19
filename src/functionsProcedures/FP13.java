package functionsProcedures;

public class FP13
{static void Ordena(String[] X)
{String Temp;
    for (int P=X.length-1; P>=1; P--)
        for (int Corrente=0; Corrente<=P-1; Corrente++)
            if (X[Corrente].compareTo(X[Corrente+1])>0)
            {Temp=X[Corrente];
                X[Corrente]=X[Corrente+1];
                X[Corrente+1]=Temp;}}
    static void EscritaVetor(String[] X)
    {for(int I=0;I<= X.length-1; I++)
        System.out.print(X[I]+"\n");
        System.out.println();}
    public static void main(String[] args)
    {String[] A={"Joana", "Rui", "Adelaide", "Joaquim", "Teresa",
            "Miguel"};
        String[] B={"Maria", "Gabriela", "Rita", "Martinho"};
        Ordena(A);
        EscritaVetor(A);
        Ordena(B);
        EscritaVetor(B);}}
