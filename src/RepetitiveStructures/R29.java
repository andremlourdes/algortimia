package RepetitiveStructures;

import java.util.Scanner;

public class R29 {
    public static void main(String[] args) throws Exception {
        int C = 0;
        double Medh = 0;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Tempo médio do camionista (0 para terminar) ");
        double Tempomed = LerS.nextDouble();
        while (Tempomed != 0) {
            C++;
            Medh += 1 / Tempomed;
            System.out.print("Tempo médio do camionista (0 para terminar) ");
            Tempomed = LerS.nextDouble();
        }
        System.out.printf("Tempo médio por carga dos %d camionistas %4.1f horas", C, C / Medh);
    }
}