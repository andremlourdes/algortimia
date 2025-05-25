package ReadingWritingAssignment;

public class O20 {
    public static void main(String[] args) {
        long Agora = System.currentTimeMillis();
        System.out.printf("%1$td/%1$tm/%1$ty %1$tH:%1$tM:%1$tS\n", Agora);
        System.out.printf("%1$td/%1$tm/%1$ty\n", Agora);
        System.out.printf("%1$tD\n", Agora);
        System.out.printf("%1$tT\n", Agora);
        System.out.printf("%1$tD %1$tT\n", Agora);
    }
}