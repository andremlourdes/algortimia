package RepetitiveStructures;

public class R15
{public static void main(String[] args)
{final char C='*';
    int A=6;
    int Triangulos=5;
    String Trian="";
    for (int Linha=1; Linha<=A; Linha++)
    {for (int T=1; T <= Triangulos; T++)
    {for (int Carat=1; Carat <= Linha; Carat++)
        Trian += C;
        Trian += "\t";}
        Trian+="\n";}
    System.out.println(Trian);}}