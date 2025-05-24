package VectorsAndMatrices;

public class VM27 {
    public static void main(String[] args) {
        int N = 3;
        double[][][] Prod = new double[N][][];
        Prod[0] = new double[][]{{1, 1000, 10}, {12, 500, 15}};
        Prod[1] = new double[][]{{1, 200}, {2, 300}, {3, 400}, {4, 500}};
        Prod[2] = new double[][]{{10, 1000, 5}, {11, 2000, 10}, {12, 3000, 15}};
        double Totvendas = 0, Tot = 0;
        for (int P = 0; P <= N - 1; P++) {
            Tot = 0;
            for (int I = 0; I <= Prod[P].length - 1; I++) {
                Tot += Prod[P][I][1];
                for (int J = 2; J <= Prod[P][I].length - 1; J++) {
                    Tot -= Prod[P][I][J];
                }
            }
            System.out.printf(String.format("Subtotal do produto %d=%7.2f\n", P + 1, Tot));
            Totvendas += Tot;
        }
        System.out.printf(String.format("Total das vendas=%12.2f\n", Totvendas));
    }
}