package RepetitiveStructures;

import java.util.Scanner;

public class R23 {
    public static void main(String[] args) throws Exception {
        int N, Somadiv;
        Scanner LerS = new Scanner(System.in);
        System.out.print("N? ");
        N = LerS.nextInt();
        for (int I = 1; I <= N; I++) {
            Somadiv = 0;
            for (int D = 1; D <= I / 2; D++) {
                if (I % D == 0) {
                    Somadiv += D;
                }
            }
            if (I == Somadiv) {
                System.out.println(I);
            }
        }
    }
}