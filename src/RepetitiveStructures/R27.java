package RepetitiveStructures;

import java.util.Scanner;

public class R27 {
    public static void main(String[] args) throws Exception {
        int Maxi = 0, Mini = 10000, Numero;
        String Lista = "";
        Scanner LerS = new Scanner(System.in);
        System.out.print("Digite o número inicial (-1 para terminar): ");
        Numero = LerS.nextInt();
        while (Numero != -1) {
            Lista += String.valueOf(Numero) + " ";
            if (Numero >= Maxi) {
                Maxi = Numero;
            } else if (Numero <= Mini) {
                Mini = Numero;
            }
            System.out.printf("Digite o próximo número (-1 para terminar): ");
            Numero = LerS.nextInt();
        }
        System.out.printf("%s\nMaior=%d\nMenor=%d", Lista, Maxi, Mini);
    }
}