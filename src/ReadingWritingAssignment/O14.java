package ReadingWritingAssignment;

public class O14 {
    public static void main(String[] args) {
        String S = "99";
        int I = Integer.valueOf(S);
        I++;
        String X = String.valueOf(I);
        System.out.println(X + " tem " + X.length() + " dígitos");
    }
}