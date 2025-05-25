package RepetitiveStructures;

import java.util.Scanner;
public class R9
{public static void main(String[] args) throws Exception
{int N, Impar=1, Cubo;
    String Ts="";
    Scanner LerS = new Scanner(System.in);
    System.out.print("Limite superior do intervalo de inteiros ");
    N=LerS.nextInt();
    for (int I=1; I <= N; I++)
    {Cubo=0; Ts="";
        for (int J=1; J <= I; J++)
        {Cubo+=Impar;
            Ts += "+"+String.valueOf(Impar);
            Impar+=2;}
        System.out.printf("%d ao cubo=%s =%d\n", I, Ts,Cubo);}}}