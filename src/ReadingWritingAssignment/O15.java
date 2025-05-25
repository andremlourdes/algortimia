package ReadingWritingAssignment;

public class O15
{public enum notas {Rep, E, D, C, B, A};
    public static void main(String[] args)
    {final String e=" e ";
        final String pa="(";
        final String pf=")";
        System.out.println("Distinção: "+notas.A.ordinal()+pa+
                notas.A+pf);
        System.out.println("Aprovados: "+notas.A.ordinal()+e+
                notas.B.ordinal()+pa+notas.A+e+notas.B+pf);
        System.out.println("Prova oral: "+notas.C.ordinal()+e+
                notas.D.ordinal()+pa+notas.C+e+notas.D+pf);}}