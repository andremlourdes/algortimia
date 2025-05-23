package recurrence;

public class RC11
{public static String Quadrado(int N, int I, int J, char C1)
{if (I < 0)
    return "\n";
else
{if (J <= N-1)
    return C1+Quadrado(N, I, J+1, C1);
else
    return "\n"+Quadrado(N, I-1, 0, C1);}}
    public static void main(String[] args)
    {char C1 = '*';
        int N = 6;
        System.out.println(Quadrado(N, N-1, 0, C1));}}