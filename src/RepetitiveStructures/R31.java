package RepetitiveStructures;

import java.util.Scanner;

public class R31 {
    public static void main(String[] args) throws Exception {
        int Jogo;
        double Pontuacao;
        String Equipa, Resultado;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Nome da equipa ou ZZZ? ");
        Equipa = LerS.next();
        while (Equipa.compareToIgnoreCase("ZZZ") != 0) {
            Jogo = 0;
            Pontuacao = 0;
            System.out.printf("Resultado do jogo %s (F para terminar)? ", Jogo + 1);
            Resultado = LerS.next();
            while (Resultado.compareToIgnoreCase("F") != 0) {
                Jogo++;
                if (Resultado.compareToIgnoreCase("V") == 0) {
                    Pontuacao += 3;
                } else if (Resultado.compareToIgnoreCase("E") == 0) {
                    Pontuacao += 1;
                }
                System.out.printf("Resultado do jogo %s (F para terminar)? ", Jogo + 1);
                Resultado = LerS.next();
            }
            if (Jogo != 0) {
                System.out.printf("%s --- %5.2f pontos\n", Equipa, Pontuacao / Jogo);
            } else {
                System.out.printf("%s ainda não jogou\n", Equipa);
            }
            System.out.print("Nome da equipa ou ZZZ? ");
            Equipa = LerS.next();
        }
    }
}