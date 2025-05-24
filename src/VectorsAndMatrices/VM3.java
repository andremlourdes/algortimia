package VectorsAndMatrices;

public class VM3
{public static void main(String[] args)
{int N=16;
    char Letra='A';
    char[] Letras =new char[N];
    for (int I=0; I <= N-1; I++)
    {Letras[I]=Letra;
        Letra++;}
    for (int I=0; I <= N-1; I++)
        System.out.printf("%3c",Letras[I]);
    System.out.println();}}
