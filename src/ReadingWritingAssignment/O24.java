package ReadingWritingAssignment;

public class O24 {
    enum Situacao {Aprovado, Oral, Reprovado}

    public static void main(String[] args) {
        String Enumeracao = String.format("Geral %10s\nNúmero " +
                "%9d\n", Situacao.Oral, (int) Situacao.Oral.ordinal() + 1);
        System.out.printf(Enumeracao);
    }
}