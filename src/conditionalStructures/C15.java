package conditionalStructures;

import java.util.Scanner;
public class C15
{public static void main(String[] args) throws Exception
{int X, Y, Operador;
    double Resul=0;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Operando 1? ");
    X=LerS.nextInt() ;
    System.out.print("Operando 2? ");
    Y=LerS.nextInt();
    System.out.print("Operação +, - , * /? ");
    Operador=(int)LerS.next().charAt(0);
    switch (Operador)
    {case '+':
        Resul=X+Y;
        break;
        case '-':
            Resul=X-Y;
            break;
        case '*':
            Resul=X * Y;
            break;
        case '/':
            Resul =(double) X/Y;
            break;}
    System.out.printf("%d %c %d=%5.2f", X, Operador, Y, Resul);}}