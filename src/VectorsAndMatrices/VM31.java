package VectorsAndMatrices;

public class VM31 {
    public static void main(String[] args) {
        int[][] A = {{0, 1, 0}, {4, 0, 2}, {6, 3, 3}};
        int[][] B = {{1, 0, 1}, {-1, 2, -2}, {1, -3, 3}};
        int N = A.length;
        int M = A[0].length;
        int[][] C = new int[N][M];
        for (int I = 0; I <= N - 1; I++) {
            for (int J = 0; J <= M - 1; J++) {
                C[I][J] = A[I][J] + B[I][J];
            }
        }
        for (int I = 0; I <= N - 1; I++) {
            for (int J = 0; J <= M - 1; J++) {
                System.out.printf("%4d", C[I][J]);
            }
            System.out.println();
        }
    }
}