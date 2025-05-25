package sequentialStructures;

import java.util.Scanner;

public class S9 {
    public static void main(String[] args) throws Exception {
        double Vprodutos, Perdesc, Taxaiva;
        System.out.print("Valor dos produtos -> ");
        Scanner LerS = new Scanner(System.in);
        Vprodutos = LerS.nextDouble();
        System.out.print("Percentagem de desconto % -> ");
        Perdesc = LerS.nextDouble();
        System.out.print("Taxa de IVA % -> ");
        Taxaiva = LerS.nextDouble();
        double Desc = Vprodutos * Perdesc / 100;
        double Total = Vprodutos - Desc;
        double Iva = Total * Taxaiva / 100;
        Total += Iva;
        System.out.printf(String.format("Total euros: %7.2f", Total));
        LerS.close();
    }
}