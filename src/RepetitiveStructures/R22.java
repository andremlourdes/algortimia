package RepetitiveStructures;

import java.text.*;

public class R22 {
    public static void main(String[] args) {
        final char Espaco = ' ', Ponto = '.';
        int Contapal = 0;
        String Frase = "Hoje, joga o FCP com o Nacional.";
        for (int X = 0; X < Frase.length(); X++) {
            if (Frase.charAt(X) == Espaco || Frase.charAt(X) == Ponto) {
                Contapal++;
            }
        }
        System.out.printf("A frase: %s tem %d palavras.", Frase, Contapal);
    }
}