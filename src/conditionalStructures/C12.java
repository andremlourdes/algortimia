package conditionalStructures;

import java.util.Scanner;
public class C12
{public static void main(String[] args) throws Exception
{int Dias, Mes;
    System.out.print("Número do mês? ");
    Scanner LerS = new Scanner(System.in);
    Mes=LerS.nextInt();
    switch (Mes)
    {case 2:
        Dias=29;
        break;
        case 4:
        case 6:
        case 9:
        case 11:
            Dias=30;
            break;
        default:
            Dias=31;
            break;}
    System.out.printf("O mês %d tem %d dias", Mes, Dias);}}