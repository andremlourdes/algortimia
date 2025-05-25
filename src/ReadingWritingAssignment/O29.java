package ReadingWritingAssignment;

import java.io.*;
public class O29
{public static void main(String[] args) throws IOException
{boolean VerdadeouNao, Resul;
    String S="";
    InputStreamReader LerS = new InputStreamReader(System.in);
    BufferedReader GuardaS = new BufferedReader(LerS);
    System.out.print("3*5=18 ? ");
    S = GuardaS.readLine();
    Resul=(3*5==18);
    VerdadeouNao=Boolean.valueOf(S);
    System.out.println("Respondeu " + VerdadeouNao);
    System.out.println("A resposta correta é "+Resul);}}

/*
import java.util.Scanner;
public class O29
{public static void main(String[] args) throws Exception
{boolean VerdadeouNao, Resul;
Scanner Teclado=new Scanner(System.in);
Resul=(3*5==18);
System.out.print("3*5=18 ? ");
VerdadeouNao=Teclado.nextBoolean();
System.out.println("Respondeu " + VerdadeouNao);
System.out.println("A resposta correta é "+Resul);}}
 */