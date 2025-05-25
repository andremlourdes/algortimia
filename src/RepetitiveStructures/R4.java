package RepetitiveStructures;

public class R4
{public static void main(String[] args)
{final char Carat='X';
    final char Espaco =' ';
    int Larg=5, Comp=10;
    for (int C=1; C<=Comp; C++)
        System.out.print(Carat);
    System.out.println();
    for (int L=1; L <= Larg; L++)
    {System.out.print(Carat);
        for (int W=2; W<=Comp-1; W++)
            System.out.print(Espaco);
        System.out.println(Carat);}
    for (int C=1; C <= Comp; C++)
        System.out.print(Carat);
    System.out.println();}}