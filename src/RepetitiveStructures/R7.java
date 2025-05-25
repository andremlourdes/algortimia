package RepetitiveStructures;

public class R7
{public static void main(String[] args)
{final char Carat1='X';
    final char Carat2='O';
    final int N=6;
    for (int I=1; I <= N; I++)
    {for (int J=1; J <= N; J++)
        if ((I + J) % 2 == 0)
            System.out.print(Carat1);
        else
            System.out.print(Carat2);
        System.out.println();}}}