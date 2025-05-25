package RepetitiveStructures;

import java.util.Scanner;

public class R28 {
    public static void main(String[] args) throws Exception {
        int N = 0, Idade;
        double Med = 0;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Idade do utente (999 para terminar) ");
        Idade = LerS.nextInt();
        while (Idade != 999) {
            N++;
            Med += Idade;
            System.out.print("Idade do utente (999 para terminar) ");
            Idade = LerS.nextInt();
        }
        System.out.printf(String.format("Média das idades das %d pessoas=%2.2f anos", N, Med / N));
    }
}