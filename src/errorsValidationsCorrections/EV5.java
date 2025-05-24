package errorsValidationsCorrections;

import java.util.Scanner;

public class EV5 {
    public static void main(String[] args) throws Exception {
        final String Resp1 = "SIM", Resp2 = "NÃO";
        final String Pergunta = "Mais nomes?";
        int I = -1, ContaA = 0;
        String Rperg = "";
        String[] Dados = new String[20];
        Boolean Er = true;
        Scanner LerS = new Scanner(System.in);

        do {
            try {
                I++;
                System.out.print("Nome ");
                Dados[I] = LerS.next().toUpperCase();
                System.out.print(Pergunta);
                Rperg = LerS.next().toUpperCase();
                if (Rperg.compareTo(Resp1) != 0 && Rperg.compareTo(Resp2) != 0)
                    throw new Exception();
            } catch (Exception e) {
                Er = true;
                while (Er == true) {
                    System.out.println("Responda SIM ou NÃO ");
                    System.out.print(Pergunta);
                    Rperg = LerS.next().toUpperCase();
                    Er = (Rperg.compareTo(Resp1) != 0 && Rperg.compareTo(Resp2) != 0);
                }
            } finally {
                if (Dados[I].charAt(0) == 'A')
                    ContaA++;
            }
        } while (Rperg.compareTo(Resp1) == 0);

        System.out.printf("%d nome(s) começado(s) por A", ContaA);
    }
}