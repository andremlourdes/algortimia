package conditionalStructures;

import java.util.Scanner;

public class C4 {
    public static void main(String[] args) throws Exception {
        double A, B, C, Disc;
        System.out.print("Digite o coef. de x^2 ");
        Scanner LerS = new Scanner(System.in);
        A = LerS.nextDouble();
        System.out.print("Digite coef. de x ");
        B = LerS.nextDouble();
        System.out.print("Digite o coef. independente ");
        C = LerS.nextDouble();
        Disc = Math.pow(B, 2) - 4 * A * C;
        if (Disc > 0) {
            System.out.print(String.format("x1=%5.2f\n", (B + Math.sqrt(Disc)) / (2 * A)));
            System.out.print(String.format("x2=%5.2f\n", (-B - Math.sqrt(Disc)) / (2 * A)));
        } else if (Disc == 0) {
            System.out.print(String.format("x1=x2 %5.2f \n", -B / (2 * A)));
        } else {
            System.out.print(String.format("Raízes imaginárias\n"));
        }
        LerS.close();
    }
}