package functionsProcedures;

import java.util.Scanner;
public class FP9
{static int LeValida (int I)
{int N=0;
    boolean Valida=false;
    while (Valida == false)
    {try
    {Scanner LerS= new Scanner(System.in);
        System.out.printf("Nota do aluno %d=", I+1);
        N=LerS.nextInt();
        Valida=N>=0 && N<=20;
        if (Valida==false)
            throw new Exception();}
    catch (Exception e)
    {System.out.println ("A nota é um número inteiro igual ou"
            +"superior a 0 e inferior ou igual a 20");}}
    return N;}
    public static void main(String[] args) throws Exception
    {int[] X=new int[5];
        for (int I=0; I<=X.length-1; I++)
        {X[I]=LeValida(I);}
        System.out.println("Notas lidas: ");
        for (int I=0; I<=X.length-1; I++)
        {System.out.println(I+1+ "--"+ X[I]);}}}
