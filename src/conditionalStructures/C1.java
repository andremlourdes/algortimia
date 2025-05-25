package conditionalStructures;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) throws Exception {
        double A, B, Maior;
        System.out.print("Digite o primeiro número: ");
        Scanner LerS = new Scanner(System.in);
        A = LerS.nextDouble();
        System.out.print("Digite o segundo número: ");
        B = LerS.nextDouble();
        if (A > B)
            Maior = A;
        else
            Maior = B;
        System.out.printf(String.format("%1.4f é o maior dos dois números: %1.4f e %1.4f", Maior, A, B));
        LerS.close();
    }
}