package functionsProcedures;

public class FP1
{static void RaizesQuad(int Inf, int Sup)
{for (int I=Inf; I<=Sup;I++)
    System.out.print(String.format("%5.1f",Math.sqrt(I)));
    System.out.println(); }
    public static void main(String[] args)
    {RaizesQuad(1, 20);
        RaizesQuad(25, 50);
        RaizesQuad(100, 120);}}