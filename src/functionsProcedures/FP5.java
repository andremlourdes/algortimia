package functionsProcedures;

import java.util.Scanner;
public class FP5
{static int ContaIniciais(String Nome, int Conta)
{if ((Nome.charAt(0)== 'A')|| (Nome.charAt(0)=='B')
        ||(Nome.charAt(0)=='C'))
    Conta++;
    return Conta;}
    public static void main(String[] args) throws Exception
    {int Conta=0;
        String Nome;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um nome ou ZZZ ");
        Nome=LerS.next().toUpperCase();
        while (Nome.compareTo("ZZZ")!=0)
        {Conta=ContaIniciais(Nome,Conta);
            System.out.print("Digite um nome ou ZZZ ");
            Nome=LerS.next().toUpperCase();}
        System.out.printf("Há %d nome(s) começado(s) por A, B ou C",
                Conta);}}