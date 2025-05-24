package VectorsAndMatrices;

public class VM19
{public static void main(String[] args)
{String[][] Alunos ={{"João", "Teresa", "Rui"},
        {"Joana", "Miguel"},
        {"Maria", "Telmo", "Ana", "Paulino", "Lia"},
        {"Daniel", "Eva", "Laura", "Paulo", }};
    for (int i = 0; i<Alunos.length;i++)
    {for (int j=0; j<Alunos[i].length; j++)
        System.out.print(Alunos[i][j]+" ");
        System.out.println();}}}