package RepetitiveStructures;

public class R13
{public static void main(String[] args)
{int Nd, Soma, Prod, X, Expoente, Dig;
    for (int N=100; N<=999; N++)
    {Nd=(int) Math.log10(N) + 1;
        Soma=0; Prod=1; X=N;Expoente=Nd-1;
        for (int D=1; D<=Nd; D++)
        {Dig=X/(int)Math.pow(10, Expoente);
            Soma+=Dig;
            Prod*=Dig;
            X-=Dig * (int)Math.pow(10, Expoente);
            Expoente--;}
        if (Soma==Prod)
            System.out.println(N);}}}