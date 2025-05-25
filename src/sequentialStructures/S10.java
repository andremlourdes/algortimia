package sequentialStructures;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) throws Exception {
        int Ncarros;
        double Sbase, Y, P, Vvendas, Sal;
        String Nome;
        Scanner LerS = new Scanner(System.in);

        System.out.printf("Digite o nome do vendedor -> ");
        Nome = LerS.next();

        System.out.printf("Digite o salário base -> ");
        Sbase = LerS.nextDouble();

        System.out.print("Comissão por cada carro vendido -> ");
        Y = LerS.nextDouble();

        System.out.print("Digite a percentagem sobre o valor das vendas (%) -> ");
        P = LerS.nextDouble();

        System.out.print("Número de carros vendidos -> ");
        Ncarros = LerS.nextInt();

        System.out.print("Digite o valor das vendas -> ");
        Vvendas = LerS.nextDouble();

        Sal = Sbase + Ncarros * Y + Vvendas * (P / 100);

        System.out.printf(String.format("Salário a processar para %s > %7.2f euros", Nome, Sal));

        LerS.close();
    }
}