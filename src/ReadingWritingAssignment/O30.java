package ReadingWritingAssignment;

import java.io.*;
import java.util.Date;
import java.text.*;
public class O30
{public static void main(String[] args) throws IOException,
        ParseException
{String S="", Dia, Mes, Ano;
    DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    InputStreamReader LerS = new InputStreamReader(System.in);
    BufferedReader GuardaS = new BufferedReader(LerS);
    System.out.print("Digite a data do seu nascimento ");
    S=GuardaS.readLine();
    Date DataNasc=null;
    DataNasc=(Date) fmt.parse(S);
    Dia=String.format("%1$td\n", DataNasc);
    Mes=String.format("%1$tm\n", DataNasc);
    Ano=String.format("%1$ty\n", DataNasc);
    System.out.println(String.format("%1$td/%1$tm/%1$ty",
            DataNasc));
    System.out.printf("Dia:"+Dia);
    System.out.printf("Mês:"+Mes);
    System.out.printf("Ano:"+Ano);}}

/*
import java.util.Date;
import java.util.Scanner;
import java.text.*;
public class O30
{public static void main(String[] args) throws Exception
{String S="", Dia, Mes, Ano;
DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
Scanner Teclado=new Scanner(System.in);
System.out.print("Digite a data do seu nascimento ");
S=Teclado.next();
Date DataNasc=null;
DataNasc=(Date) fmt.parse(S);
Dia=String.format("%1$td\n", DataNasc);
Mes=String.format("%1$tm\n", DataNasc);
Ano=String.format("%1$ty\n", DataNasc);
System.out.println(String.format("%1$td/%1$tm/%1$ty",
DataNasc));
System.out.printf("Dia:"+Dia);
System.out.printf("Mês:"+Mes);
System.out.printf("Ano:"+Ano);}}
 */