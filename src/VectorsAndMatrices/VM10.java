package VectorsAndMatrices;

import java.util.Scanner;
public class VM10
{public static void main(String[] args)throws Exception
{final int Mesano=12;
    int Mes;
    double Vvendas;
    double[] Vendas = new double[12];
    Scanner LerS= new Scanner(System.in);
    for (int M = 0; M <Mesano; M++)
        Vendas[M] = 0;
    System.out.print("Mês da venda ou 0 para terminar ");
    Mes = LerS.nextInt();
    while (Mes != 0)
    {System.out.print("Valor da venda ");
        Vvendas = LerS.nextDouble();
        Vendas[Mes-1] += Vvendas;
        System.out.print("Mês da venda ou 0 para terminar ");
        Mes = LerS.nextInt();}
    System.out.printf("%s %15s\n", "Mês", "Total de Vendas");
    for (int M = 0; M < Mesano; M++)
        if (Vendas[M]!=0)
            System.out.printf(String.format("%2d%12.2f\n", M + 1,
                    Vendas[M]));}}