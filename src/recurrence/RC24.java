package recurrence;

public class RC24
{public static void Hanoi(int Altura, char De, char Para, char
        Usando)
{if (Altura==1)
    System.out.printf("Mudar o disco de %c para %c\n", De, Para);
else
{Hanoi(Altura-1, De, Usando, Para);
    System.out.printf("Mudar o disco de %c para %c\n", De,
            Para);
    Hanoi(Altura-1, Usando, Para, De);}}
    public static void main(String[] args)
    {int Altura = 4;
        Hanoi(Altura, 'A', 'C', 'B');}}