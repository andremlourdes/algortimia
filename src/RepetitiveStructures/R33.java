package RepetitiveStructures;

import java.util.Scanner;

public class R33 {
    public static void main(String[] args) throws Exception {
        int Nota, Peso, Pesos, N;
        float Notafinal, Maisalta = 0;
        char Tipo;
        String Pauta = String.format("%1$-20s%2$s\n", "Nome", "Class. final");
        String Nome, Disc;
        System.out.print("Quantos alunos são? ");
        Scanner LerS = new Scanner(System.in);
        N = LerS.nextInt();
        for (int A = 1; A <= N; A++) {
            System.out.print("Nome ");
            Nome = LerS.next();
            Notafinal = 0;
            Pesos = 0;
            System.out.print("Nome da disciplina ou ZZZ ");
            Disc = LerS.next();
            while (Disc.compareToIgnoreCase("ZZZ") != 0) {
                System.out.print("Tipo de disciplina (A ou S) ");
                Tipo = LerS.next().charAt(0);
                System.out.print("Nota ");
                Nota = LerS.nextInt();
                Peso = 1;
                if (Tipo == 'A' || Tipo == 'a') {
                    Peso = 2;
                }
                Pesos += Peso;
                Notafinal += Peso * Nota;
                System.out.print("Nome da disciplina ou ZZZ ");
                Disc = LerS.next();
            }
            Notafinal = Notafinal / Pesos;
            if (Notafinal >= Maisalta) {
                Maisalta = Notafinal;
            }
            Pauta += String.format("%1$-25s %2$5.2f\n", Nome, Notafinal);
        }
        Pauta += "\n\nNota mais alta: " + Maisalta;
        System.out.printf(Pauta);
    }
}