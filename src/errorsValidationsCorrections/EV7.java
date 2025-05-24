package errorsValidationsCorrections;

import java.util.Scanner;
public class EV7
{public static void main(String[] args) throws Exception
{char Categ=' ' ;
    boolean Valida=false;
    String S;
    Scanner LerS= new Scanner(System.in);
    while (Valida == false)
    {try
    {System.out.print("Categoria profissional >");
        S=LerS.next();
        Categ=S.charAt(0);
        Valida=Categ >='C' && Categ<='E';
        if (Valida==false)
            throw new Exception();}
    catch (Exception e)
    {System.out.println("Digite C, D ou E");}}
    System.out.printf("Categoria validada: %c ", Categ);}}