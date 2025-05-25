package sequentialStructures;

import java.util.Scanner;

public class S5 {
    public static void main(String[] args) throws Exception {
        double Usd, Taxa, Eur;
        System.out.print("Digite a quantia em dólares americanos ");
        Scanner LerS = new Scanner(System.in);
        Usd = LerS.nextDouble();
        System.out.print("Digite a taxa de câmbio (número de euros por um dólar americano) ");
        Taxa = LerS.nextDouble();
        Eur = Usd * Taxa;
        System.out.printf(String.format("%6.2f dólares americanos equivalem a %6.2f euros", Usd, Eur));
    }
}