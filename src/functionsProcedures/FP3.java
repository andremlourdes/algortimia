package functionsProcedures;

import java.util.Scanner;
public class FP3
{static void Troca(String[] X, String[] Y)
{String Temporaria;
    Temporaria=X[0];
    X[0]=Y[0];
    Y[0]=Temporaria;}
    public static void main(String[] args) throws  Exception
    {String[] X=new String[1];
        String[] Y=new String[1];
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite o valor da primeira variável (X) ");
        X[0]=LerS.next();
        System.out.print("Digite o valor da segunda variável (Y) ");
        Y[0]=LerS.next();
        Troca(X,Y);
        System.out.println("X="+ X[0]);
        System.out.println("Y="+ Y[0]);}}
