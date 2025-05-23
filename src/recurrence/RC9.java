package recurrence;

public class RC9
{public static int TabelaF(int X)
{if (X <= 3)
    return 7;
else
    return TabelaF(X-1)+12;}
    public static void main(String[] args)
    {String Tabela=String.format("%3s %8s\n","X","F(x)");
        for (int X = 0; X <= 10; X++)
            Tabela+=String.format("%3s %8s\n",X,TabelaF(X));
        System.out.println(Tabela);}}
