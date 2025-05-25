package sequentialStructures;

import java.util.Scanner;

public class S6 {
    public static void main(String[] args) throws Exception {
        double C, F;
        System.out.print("Temperatura em graus Fahrenheit? ");
        Scanner LerS = new Scanner(System.in);
        F = LerS.nextDouble();
        C = (F - 32) / 1.8;
        System.out.printf(String.format("%3.1f graus Fahrenheit = %3.1f graus Celsius", F, C));
    }
}