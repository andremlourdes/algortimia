package recurrence;

import java.util.Scanner;
public class RC12
{public static boolean Primo(int N, int Div)
{if (N==1)
    return false;
else
if (N == 2)
    return true;
else
if (Div >(int)Math.sqrt (N))
    return true;
else if (N % Div == 0)
    return false;
else return Primo(N, Div+1);}
    public static void main(String[] args) throws Exception
    {int N, Div;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um inteiro ");
        N=LerS.nextInt();
        Div = 2;
        System.out.printf("%d %s", N, Primo(N, Div)? "Primo"
                : "Não primo");}}