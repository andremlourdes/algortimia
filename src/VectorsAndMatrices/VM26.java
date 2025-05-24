package VectorsAndMatrices;

import java.util.Scanner;

public class VM26 {
    public static void main(String[] args) throws Exception {
        int N, M;
        Scanner LerS = new Scanner(System.in);
        char[] Chave = {'a', 'b', 'c', 'c', 'd', 'a'};
        int[] Cotacao = {1, 2, 3, 3, 2, 2};
        M = Chave.length;
        System.out.print("Quantos alunos há? ");
        N = LerS.nextInt();
        char[][] Resp = new char[N][M];
        int[] Final = new int[N];
        for (int I = 0; I < N; I++) {
            for (int J = 0; J < M; J++) {
                System.out.printf("Resposta do aluno %d à pergunta %d ", I + 1, J + 1);
                Resp[I][J] = LerS.next().charAt(0);
            }
        }
        for (int I = 0; I < N; I++) {
            Final[I] = 0;
            for (int J = 0; J < M; J++) {
                if (Resp[I][J] == Chave[J]) {
                    Final[I] += Cotacao[J];
                }
            }
        }
        System.out.printf("\n %6s  %s\n", "Aluno", "Classificação");
        for (int I = 0; I < N; I++) {
            System.out.printf("%4d %8d\n", I + 1, Final[I]);
        }
    }
}