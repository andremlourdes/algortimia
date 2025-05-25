package ReadingWritingAssignment;

public class O25
{public static void main(String[] args)
{double Salario=1000, Vendas=100, Capital=1000;
    double Aumento=10, Fatorjuro=1.05, Iva=20;
    int Resto=10;
    Salario += Aumento;
    System.out.println("Salário depois do aumento="+Salario);
    Vendas-=Iva;
    System.out.println("Vendas líquidas="+Vendas);
    Capital *= Fatorjuro;
    System.out.println("Capital acumulado="+Capital);
    Resto%=3;
    System.out.println("Resto da divisão de 10 por 3="+Resto);}}