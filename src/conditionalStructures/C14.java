package conditionalStructures;

import java.util.Scanner;

public class C14 {
    public static void main(String[] args) throws Exception {
        double Desconto;
        String CProd;

        System.out.print("Três primeiras letras da classe do produto? ");
        Scanner scanner = new Scanner(System.in);
        CProd = scanner.next().toUpperCase();

        switch (CProd) {
            case "VEG":
                Desconto = 0.15;
                break;
            case "LAT":
            case "CER":
            case "AGU":
                Desconto = 0.10;
                break;
            default:
                Desconto = 0.01;
                break;
        }

        System.out.printf(String.format("Os produtos da classe %s têm %1.2f de desconto", CProd, Desconto));
        scanner.close();
    }
}