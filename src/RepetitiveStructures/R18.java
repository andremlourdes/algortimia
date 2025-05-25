package RepetitiveStructures;

public class R18
{public static void main(String[] args)
{final int Anos=3, Anoinicio=2012;
    final double Taxamin=2, Taxamax=3, Inicial=1500;
    double Acumu=0;
    System.out.printf("%13.0f €%5s", Inicial,"");
    for (double Taxa=Taxamin; Taxa<=Taxamax; Taxa +=0.5)
        System.out.printf("%4.2f%c%8s", Taxa,'%',"");
    System.out.println();
    for (int N=1; N <= Anos; N++)
    {System.out.printf("%13d",Anoinicio+N);
        for (double Taxa=Taxamin; Taxa<=Taxamax; Taxa +=0.5)
        {Acumu=Inicial*Math.pow((1+Taxa/100), N);
            System.out.printf("%13.2f", Acumu);}
        System.out.println();}}}