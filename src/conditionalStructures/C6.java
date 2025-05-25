package conditionalStructures;

import java.util.Scanner;

public class C6 {
    public static void main(String[] args) throws Exception {
        int Nota;
        System.out.print("Nota do exame: ");
        Scanner LerS = new Scanner(System.in);
        Nota = LerS.nextInt();
        System.out.println(Nota >= 10 ? "Parabéns" : "Marque novo exame");
        LerS.close();
    }
}