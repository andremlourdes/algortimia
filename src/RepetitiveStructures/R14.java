package RepetitiveStructures;

public class R14
{public static void main(String[] args)
{final char Carat='X';
    final char Ponto='.';
    int Dimensao=12;
    for(int Linha=1; Linha<=Dimensao; Linha++)
    {for (int Coluna=1; Coluna<=Dimensao; Coluna++)
    {if ((Linha==Coluna) || (Coluna==Dimensao-Linha+1))
        System.out.print(Carat);
    else
        System.out.print(Ponto);}
        System.out.println();}}}
