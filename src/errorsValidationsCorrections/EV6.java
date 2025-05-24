package errorsValidationsCorrections;

import java.util.Scanner;

public class EV6 {
    public static void main(String[] args) throws Exception {
        int X = 0;
        boolean Valida = false;
        Scanner LerS = new Scanner(System.in);

        while (Valida == false) {
            try {
                System.out.print("Digite a sua idade >");
                X = LerS.nextInt();
                Valida = X >= 17 && X <= 77;
                if (Valida == false)
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("A idade é um número inteiro igual ou superior a 17 e inferior ou igual a 77");
            }
        }
        System.out.printf("Idade validada: %d anos\n", X);
    }
}