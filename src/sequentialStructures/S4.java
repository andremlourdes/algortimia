package sequentialStructures;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) throws Exception {
        double X, Y, F;
        System.out.print("Digite o valor de X=");
        Scanner LerS = new Scanner(System.in);
        X = LerS.nextDouble();
        System.out.print("Digite o valor de Y=");
        Y = LerS.nextDouble();
        F = (Y + Math.sqrt(Math.abs(2 * X + 10))) / (2 * X);
        System.out.printf(String.format("F(%1.0f,%1.0f)=%6.3f", X, Y, F));
    }
}