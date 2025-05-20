package functionsProcedures;

public class FP2
{static void ImpressaoNomes(String[] Nomes, int Conta)
{for (int I=0; I<Conta;I++)
    System.out.println(Nomes[I]); }
    public static void main(String[] args)
    {String[] Nomes={"Ana", "António", "Beatriz", "Joana",
            "Raul", "Vitória"};
        int X=4;
        ImpressaoNomes(Nomes, X);
        System.out.printf("Selecionámos os %d primeiros nomes de uma
                lista de %d",X, Nomes.length);}}