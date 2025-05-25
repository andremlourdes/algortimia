package conditionalStructures;

import java.util.Scanner;

public class C5 {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite o primeiro número ");
        Scanner LerS = new Scanner(System.in);
        double A = LerS.nextDouble();
        System.out.print("Digite o segundo número ");
        double B = LerS.nextDouble();
        System.out.print("Digite o terceiro número ");
        double C = LerS.nextDouble();
        double Maior;
        if (A > B)
            if (A > C)
                Maior = A;
            else
                Maior = C;
        else if (B > C)
            Maior = B;
        else
            Maior = C;
        System.out.printf(String.format("%3.2f é o maior de %3.2f, %3.2f, %3.2f", Maior, A, B, C));
        LerS.close();
    }
}