package VectorsAndMatrices;

import java.util.Scanner;

public class VM20 {
    public static void main(String[] args) throws Exception {
        int N, I, V, D;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Quantos produtos há? ");
        N = LerS.nextInt();
        int[][][] Produtos = new int[N][][];
        for (int P = 0; P <= N - 1; P++) {
            System.out.printf("Produto %d\n", P + 1);
            System.out.printf("Quantas vendas para o produto %d? ", P + 1);
            V = LerS.nextInt();
            System.out.printf("Quantos dados para cada venda do produto %d? ", P + 1);
            D = LerS.nextInt();
            Produtos[P] = new int[V][D];
            for (I = 0; I <= Produtos[P].length - 1; I++) {
                for (int J = 0; J <= Produtos[P][I].length - 1; J++) {
                    System.out.printf("Dados para a linha %d coluna %d  = ", I + 1, J + 1);
                    Produtos[P][I][J] = LerS.nextInt();
                }
            }
        }
        System.out.println();
        for (int P = 0; P <= N - 1; P++) {
            System.out.printf("Produto %d\n", P + 1);
            for (I = 0; I <= Produtos[P].length - 1; I++) {
                for (int J = 0; J <= Produtos[P][I].length - 1; J++) {
                    System.out.printf("%6d", Produtos[P][I][J]);
                }
                System.out.println();
            }
        }
    }
}