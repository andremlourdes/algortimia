package recurrence;

public class RC7
{public static void Inversao(int N)
{if (N > 0)
{System.out.print(N % 10);
    Inversao(N/10);}}
    public static void main(String[] args)
    {int N = 654321;
        Inversao(N);
        System.out.println("\n");}}