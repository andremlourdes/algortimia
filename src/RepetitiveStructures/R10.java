package RepetitiveStructures;

public class R10
{public static void main(String[] args)
{int Fcorrente, Fult=1, Fpenult=1;
    System.out.printf("F%d=%d ",1, Fpenult);
    System.out.printf("F%d=%d ",2, Fult);
    for (int N=3; N <= 20; N++)
    {Fcorrente=Fult + Fpenult;
        System.out.printf("F%d=%d ",N, Fcorrente);
        Fpenult=Fult;
        Fult=Fcorrente;}}}