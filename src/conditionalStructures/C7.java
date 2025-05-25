package conditionalStructures;

import java.util.Scanner;
public class C7
{public static void main(String[] args) throws Exception
{final int Pmaxima=5;
    String Aviso="Aumento razoável";
    double Patual, Pantes, Varia;
    System.out.print("Preço atual? ");
    Scanner LerS = new Scanner(System.in);
    Patual=LerS.nextDouble();
    System.out.print("Preço anterior? ");
    Pantes= LerS.nextDouble();
    Varia =(Patual-Pantes)/Pantes*100;
    if (Varia>Pmaxima)
        Aviso="Aumento excessivo!";
    System.out.print(String.format("%5.2f%c ---> %s",Varia,'%',
            Aviso));}}