package functionsProcedures;

import java.util.Scanner;
public class FP8
{static int Segundos(int Seg)
{return Seg%60;}
    static int Minutos(int Seg)
    {return (Seg/60)%60; }
    static int Horas(int Seg)
    {return (Seg/60) / 60; }
    public static void main(String[] args) throws Exception
    {int Seg,H,M,S;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite o número de segundos a converter ");
        Seg=LerS.nextInt();
        H=Horas(Seg);
        M=Minutos(Seg);
        S=Segundos(Seg);
        System.out.printf("%d=%d:%d:%d}", Seg, H, M, S);}}
