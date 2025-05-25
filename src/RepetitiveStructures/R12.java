package RepetitiveStructures;

import java.util.Scanner;
public class R12
{public static void main(String[] args)throws Exception
{int A, B, Div;
    String Lista;
    boolean Primo;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Digite o limite inferior do intervalo ");
    A=LerS.nextInt();
    System.out.print("Digite o limite superior do intervalo ");
    B=LerS.nextInt();
    Lista="Primos entre "+A+" e "+B +"\n";
    if (A<=2)
    {A=2;
        Lista += String.valueOf(A);}
    if (A%2==0)
        A+=1;
    for (int N=A; N<=B; N+=2)
    {Primo=true;
        Div=2;
        while ((Primo==true) && (Div<=(int)Math.sqrt(N)))
        {if (N % Div==0)
            Primo=false;
        else
            Div++;}
        if (Primo==true)
            Lista+=" " +String.valueOf(N);}
    System.out.println(Lista);}}
