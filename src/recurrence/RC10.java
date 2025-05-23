package recurrence;

public class RC10 {
    public static double SomaSerie(int N, double Numerador, double Denominador, int Ordem) {
        if (Ordem > N)
            return 0;
        else {
            if (Ordem % 2 == 0)
                Numerador += 2;
            else
                Denominador += 2;
            return Numerador / Denominador + SomaSerie(N, Numerador, Denominador, Ordem + 1);
        }
    }

    public static void main(String[] args) {
        int N = 21, Ordem = 1;
        double Numerador = 1, Denominador = 0;
        System.out.printf("Somatório dos %d termos=%5.3f", N, SomaSerie(N, Numerador, Denominador, Ordem));
    }
}