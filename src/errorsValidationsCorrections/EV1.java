package errorsValidationsCorrections;

import java.util.Scanner;

public class EV1 {
    public static void main(String[] args) throws Exception {
        int X, Y;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Dividendo? ");
        X = LerS.nextInt();
        System.out.print("Divisor? ");
        Y = LerS.nextInt();
        try {
            System.out.println(X / Y);
        } catch (ArithmeticException e) {
            System.out.println("O divisor tem de ser diferente de zero");
        }
    }
}