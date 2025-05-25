package RepetitiveStructures;

import java.util.Scanner;
public class R21
{public static void main(String[] args)throws Exception
{int N, Numero, Total, Nat, Dig, Checkdigito, Codcheck ;
    Scanner LerS=new Scanner(System.in);
    System.out.print("Digite o código numérico: ");
    Numero= LerS.nextInt();
    N=Numero;
    Total=0;
    Nat=1;Dig=0;
    while (N>0)
    {Dig=N%10;
        Total +=Dig*Nat;
        N/=10;
        Nat++;}
    Checkdigito=Total%7;
    Codcheck=Numero*10 + Checkdigito;
    System.out.println(Codcheck);}}
