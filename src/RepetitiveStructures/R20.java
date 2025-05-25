package RepetitiveStructures;

import java.util.Scanner;
public class R20
{public static void main(String[] args) throws Exception
{int Dig=0, N, Nd, Expoente;
    String Decomp;
    Scanner LerS=new Scanner(System.in);
    System.out.print("N? ");
    N=LerS.nextInt();
    Nd=(int)Math.log10(N) + 1;
    Expoente=Nd - 1;
    Decomp =String.valueOf(N)+"=";
    for (int D=1; D <=Nd; D++)
    {Dig=N/(int)Math.pow(10, Expoente);
        Decomp
                +=String.valueOf(Dig)+"*10"+"^"+String.valueOf(Expoente);
        if (D !=Nd)
            Decomp +="+";
        N -=Dig * (int)Math.pow(10, Expoente);
        Expoente--;}
    System.out.println(Decomp);}}