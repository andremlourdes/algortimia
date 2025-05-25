package RepetitiveStructures;

public class R5 {
    public static void main(String[] args) {
        final int Termos = 95;
        double P = 0;
        int Numerador = 1;
        int Denominador = 0;
        for (int T = 1; T <= Termos; T++) {
            if (T % 2 == 0) {
                Numerador += 2;
            } else {
                Denominador += 2;
            }
            P += (double) Numerador / Denominador;
        }
        System.out.printf(String.format("P=%5.2f", P));
    }
}