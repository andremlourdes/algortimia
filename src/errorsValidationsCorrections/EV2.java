package errorsValidationsCorrections;

import java.util.Scanner;

public class EV2 {
    public static void main(String[] args) throws Exception {
        int X, Y;
        Scanner LerS = new Scanner(System.in);
        try {
            System.out.print("Dividendo? ");
            X = LerS.nextInt();
            System.out.print("Divisor? ");
            Y = LerS.nextInt();
            System.out.println(X / Y);
        } catch (java.util.InputMismatchException e1) {
            System.out.println("Estamos à espera de números inteiros");
        }
    }
}