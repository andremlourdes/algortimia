package RepetitiveStructures;

import java.util.Scanner;

public class R34 {
    public static void main(String[] args) throws Exception {
        int Conta = 0, Contaselec = 0, Estagio;
        String Lista = String.format("%1$-20s%2$s\n", "Nome", "Observação");
        String Nome = "", Obs = "";
        double Perc = 0;
        char Ingles, Internacional;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Nome do candidato ou ZZZ ");
        Nome = LerS.next();
        while (Nome.compareToIgnoreCase("ZZZ") != 0) {
            System.out.print("Nota de estágio ");
            Estagio = LerS.nextInt();
            System.out.print("Fluente em Inglês (S/...) ");
            Ingles = LerS.next().charAt(0);
            System.out.print("Carreira internacional (S/...) ");
            Internacional = LerS.next().charAt(0);
            if (Estagio > 13 && Ingles == 'S' && Internacional == 'S') {
                Obs = "Selecionada(o)";
                Contaselec += 1;
            } else {
                Obs = "Eliminada(o)";
            }
            Lista += String.format("%1$-20s%2$s\n", Nome, Obs);
            Conta += 1;
            System.out.print("Nome do candidato ou ZZZ ");
            Nome = LerS.next();
        }
        Perc = (double) Contaselec / Conta * 100;
        Lista += "\n\n" + "% de selecionados: " + Perc + "%";
        System.out.println(Lista);
    }
}