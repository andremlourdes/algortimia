package ReadingWritingAssignment;

public class O23 {
    public static void main(String[] args) {
        String cabecalho = String.format("%1$8s%2$25s\n", "Nome", "Localidade");
        System.out.print(cabecalho);
        System.out.printf("%1$-20s%2$-30s\n", "Teresa Pinto", "4100-225 Porto");
        System.out.printf("%1$-20s%2$-30s\n", "Abel Pereira", "1200-125 Lisboa");
    }
}