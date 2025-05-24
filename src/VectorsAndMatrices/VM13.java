package VectorsAndMatrices;

import java.util.Scanner;
public class VM13
{public static void main(String[] args)throws Exception
{int K;
    String Temporaria="";
    Scanner LerS= new Scanner(System.in);
    System.out.print("Quantos nomes tem a lista? ");
    K = LerS.nextInt();
    String[] Nomes = new String[K];
    int N = K - 1, Indicemenor;
    for (int I=0; I<=N; I++)
    {System.out.printf("%d nome? ",I+1);
        Nomes[I]=LerS.next();}
    for (int Pas=0; Pas<=N-1; Pas++)
    {Indicemenor=Pas;
        for (int I=Pas+1; I<=N; I++)
            if (Nomes[Indicemenor].compareToIgnoreCase(Nomes[I])>=0)
                Indicemenor=I;
        if (Indicemenor!=Pas)
        {Temporaria=Nomes[Pas];
            Nomes[Pas]=Nomes[Indicemenor];
            Nomes[Indicemenor]=Temporaria;}}
    System.out.println("\nLista ordenada:");
    for (int I=0; I<=N; I++)
        System.out.printf("%s ", Nomes[I]);}}