package errorsValidationsCorrections;

public class EV8 {
    public static void main(String[] args) {
        int N;
        int[] A = {4, 5, 6, 2, 8, 0};
        N = A.length;
        boolean Erro = false;

        for (int I = 0; I < N && Erro != true; I++) {
            try {
                System.out.printf("%4d\n", A[I]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("O índice ultrapassou o limite máximo" + e);
                Erro = true;
            }
        }
        System.out.println("Mas, continuamos o processamento");
    }
}