package recurrence;

public class RC2
{static void Contagem(int N)
{if (N == 0)
    System.out.println(N);
else
{System.out.print(N);
    Contagem(N-1);}}
    public static void main(String[] args)
    {int N = 5;
        Contagem(N);}}