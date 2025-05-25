package RepetitiveStructures;

import java.util.Scanner;

public class R35 {
    public static void main(String[] args) throws Exception {
        char Esq, Dirta;
        String Palavra;
        boolean Palindromo = true;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Digite uma palavra ");
        Palavra = LerS.next().toLowerCase();
        int Numcarat = Palavra.length();
        for (int C = 0; (C < Numcarat / 2 && Palindromo); C++) {
            Esq = Palavra.charAt(C);
            Dirta = Palavra.charAt(Numcarat - 1 - C);
            if (Esq != Dirta) {
                Palindromo = false;
            }
        }
        System.out.println(Palavra + (Palindromo ? " é palíndromo" : " não é palíndromo"));
    }
}