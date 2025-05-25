package RepetitiveStructures;

public class R24
{public static void main(String[] args)
{int Y=0;
    System.out.printf("%3s %6s\n", "x", "f(x)");
    for (int X=1; X <= 20; X += 2)
    {if (X<12)
        Y=X - 4;
    else
    if (X<15)
        Y=10;
    else
        Y=X + 4;
        System.out.printf("%3d %6d\n", X, Y);}}}