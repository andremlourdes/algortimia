package conditionalStructures;

import java.util.Scanner;
public class C11
{public static void main(String[] args) throws Exception
{final int Limaprov=10, Limdist=16;
    int T1, T2, T3;
    String Nome, Situacao;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Nome do aluno? ");
    Nome= LerS.next();
    System.out.print("Nota de Programação? ");
    T1= LerS.nextInt();
    System.out.print("Nota de Matemática? ");
    T2= LerS.nextInt();
    System.out.print("Nota de Sistemas de Informação? ");
    T3= LerS.nextInt();
    Situacao="Reprovado";
    if (T1>=Limaprov && T2>=Limaprov && T3>=Limaprov)
        Situacao="Aprovado";
    if ((T1>=Limdist && T2>=Limdist && T3>=Limaprov) ||
            (T1>=Limdist && T3>=Limdist && T2>=Limaprov)||
            (T2>=Limdist && T3>=Limdist && T1>=Limaprov))
        Situacao="Aprovado com distincao";
    System.out.printf("%s --- %s",Nome, Situacao);}}