package recurrence;

public class  RC26
{public static void Saidas(char[][] L, int Linha, int Coluna)
{final char Saida='S', Sim=' ';
    L[Linha][Coluna]=Saida;
    boolean Fim=Bordo(Linha, Coluna, L.length);
    if (Fim==true)
        ImprimirLabirinto(L);
    else
    {if (L[Linha-1][Coluna]==Sim)
        Saidas(L, Linha-1,Coluna);
        if (L[Linha][Coluna+1]==Sim)
            Saidas(L, Linha,Coluna+1);
        if (L[Linha+1][Coluna]==Sim)
            Saidas(L, Linha+1,Coluna);
        if (L[Linha][Coluna-1]==Sim )
            Saidas(L, Linha, Coluna-1);}}
    public static boolean Bordo(int Linha, int Coluna, int N)
    {return (Linha==N-1)||(Coluna==N-1)||(Linha==0)||(Coluna==0);}
    public static void ImprimirLabirinto(char[][] L)
    {String Ts="";
        for (int I=0; I <= L.length-1; I++)
        {for (int J=0; J <= L.length-1; J++)
            Ts+=L[I][J];
            Ts+="\n";}
        System.out.println("Saída do labirinto\n\n"+Ts);}
    public static void main(String[] args)
    {final char Nao='*';
        final char Sim=' ';
        int N=10;
        char[][] L=new char[N][N];
        for (int I=0; I <=N-1; I++)
            for (int J=0; J <= N-1; J++)
                L[I][J]=Nao;
        L[0][3]=Sim;L[1][3]=Sim;L[1][4]=Sim;L[1][5]=Sim; L[1][6]=Sim;
        L[2][3]=Sim;L[2][6]=Sim;L[2][7]=Sim;L[3][3]=Sim;L[3][4]=Sim;
        L[3][5]=Sim;L[3][7]=Sim;L[3][8]=Sim;L[4][4]='P';L[4][5]=Sim;
        L[4][8]=Sim;L[5][5]=Sim;L[5][8]=Sim;L[6][5]=Sim;L[7][5]=Sim;L[
            7][6]=Sim;L[7][7]=Sim;L[8][4]=Sim;L[8][5]=Sim;L[8][7]=Sim;L[9]
            [4]=Sim; L[9][7]=Sim;
        Saidas(L,4,4);}}
