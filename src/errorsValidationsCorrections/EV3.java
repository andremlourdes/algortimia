package errorsValidationsCorrections;

import java.io.*;

public class EV3 {
    public static void main(String[] args) throws IOException {
        int X, Y;
        InputStreamReader LerS = new InputStreamReader(System.in);
        BufferedReader GuardaS = new BufferedReader(LerS);
        try {
            System.out.print("Dividendo? ");
            X = Integer.valueOf(GuardaS.readLine());
            System.out.print("Divisor? ");
            Y = Integer.valueOf(GuardaS.readLine());
            System.out.println(X / Y);
        } catch (NumberFormatException e1) {
            System.out.println("Estamos à espera de números inteiros");
        } catch (ArithmeticException e2) {
            System.out.println("O divisor tem de ser diferente de zero");
        }
    }
}
/*
import java.util.Scanner;
public class EV3
{public static void main(String[] args) throws Exception
{int X,Y;
Scanner LerS= new Scanner(System.in);
try
{System.out.print("Dividendo? ");
X=LerS.nextInt();
System.out.print("Divisor? ");
Y=LerS.nextInt();
System.out.println(X/Y);}
catch (java.util.InputMismatchException e1)
{System.out.println("Estamos à espera de números inteiros");}
catch (ArithmeticException e2)
{System.out.println("O divisor tem de ser diferente de
zero");}}}
 */