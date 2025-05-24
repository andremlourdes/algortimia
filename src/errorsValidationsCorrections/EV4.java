package errorsValidationsCorrections;

public class EV4 {
    public static void main(String[] args) {
        double Desv = 0;
        double[] D = {5.78, 7, 6.54, 3.345, 10, 10.9};
        int[] I = new int[D.length];
        for (int J = 0; J < D.length; J++) {
            try {
                I[J] = (int) D[J];
                if (I[J] != D[J])
                    throw new Exception();
            } catch (Exception e) {
                System.out.printf(String.format("%4.3f foi truncado para %d\n", D[J], I[J]));
                Desv += D[J] - I[J];
            }
        }
        System.out.printf(String.format("Somatório dos erros %4.3f\n", Desv));
    }
}