package sequentialStructures;

import java.util.Scanner;
public class S7
{public static void main(String[] args) throws Exception
{double T1, T2, T3, Final;
    String Nome;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Digite o nome do aluno ->");
    Nome = LerS.next();
    LerS = new Scanner(System.in);
    System.out.print("Digite a nota do teste 1 ->");
    T1=LerS.nextDouble();
    System.out.print("Digite a nota do teste 2 ->");
    T2= LerS.nextDouble();
    System.out.print("Digite a nota do teste 3 ->");
    T3= LerS.nextDouble();
    Final=(T1 + T2 + T3) / 3 ;
    System.out.printf("%s obteve %3.0f valores", Nome, Final);}}