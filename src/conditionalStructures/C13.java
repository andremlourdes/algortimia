package conditionalStructures;

import java.util.Scanner;

public class C13 {
    public static void main(String[] args) throws Exception {
        String C;
        double Salbase;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Digite a categoria profissional> ");
        C = LerS.next();
        int Categ = (int) C.charAt(0);
        switch (Categ) {
            case 'A':
            case 'B':
            case 'C':
                Salbase = 1500;
                break;
            case 'D':
                Salbase = 1250;
                break;
            case 'E':
            case 'F':
                Salbase = 1000;
                break;
            default:
                Salbase = 500;
                break;
        }
        System.out.printf(String.format("A categoria %c tem %7.2f euros de salário base", Categ, Salbase));
        LerS.close();
    }
}