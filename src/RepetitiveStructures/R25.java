package RepetitiveStructures;

public class R25
{public static void main(String[] args)
{double Y, F, Termo;
    System.out.printf("%3s%11s%10s\n", "x","sen(x)","f(x)");
    for (double X=5; X <= 10; X += 0.5)
    {Y=Math.sin(X);F=0;
        for (int T=1; T <= 20; T++)
        {Termo=1/(T*Math.pow(X, T-1));
            F+=Termo;}
        System.out.print(String.format("%4.0f %8.0f %10.3f\n",
                X,Y,F));}}}