package ReadingWritingAssignment;

import java.io.*;
public class O27
{public static void main(String[] args) throws IOException
{String S= "";
    System.out.print("Digite uma cadeia de carateres: ");
    InputStreamReader Ler = new InputStreamReader(System.in);
    BufferedReader GuardaS = new BufferedReader(Ler);
    S = GuardaS.readLine();
    System.out.println("Digitou: " + S);}}