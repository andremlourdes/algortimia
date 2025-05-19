package functionsProcedures;

import java.util.Scanner;
public class FP15
{static void Ordena(String[][] A, int Coluna)
{for (int P=A.length-1; P>=1; P--)
    for (int Corrente=0; Corrente<=P-1; Corrente++)
        if (A[Corrente][Coluna].compareTo(A[Corrente+1][Coluna])>0)
            Troca(A, Corrente);}
    static void Troca(String [][] A, int Corrente)
    {String Temp;
        for (int J=0; J<=A[0].length-1; J++)
        {Temp=A[Corrente][J];
            A[Corrente][J]=A[Corrente+1][ J];
            A[Corrente+1][J]=Temp;}}
    static void Escrita(String[][] A)
    {for (int I=0; I<=A[0].length-1; I++)
    {for (int J=0; J<=A[0].length-1; J++)
        System.out.printf(String.format("%1$-15s", A[I][J]));
        System.out.println();}}
    public static void main(String[] args) throws Exception
    {int Coluna;
        String[][] A={{"60", "Rui", "Porto"},
                {"20","Joaquim", "Aveiro"},
                {"30","Adelino", "Porto"},
                {"50","Ricardo", "Coimbra"}};
        Scanner LerS= new Scanner(System.in);
        System.out.print("Coluna (0,1,2) que é chave de ordenação ");
        Coluna=LerS.nextInt();
        Ordena(A, Coluna);
        Escrita(A);}}
