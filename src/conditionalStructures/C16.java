package conditionalStructures;

import java.util.Scanner;
public class C16
{public static void main(String[] args) throws Exception
{int Opcao, Entidade=0, Referencia=0;
    double Quantia=0;
    System.out.println("1. Levantamentos");
    System.out.println("2. Depósitos");
    System.out.println("3. Pagamento de serviços");
    System.out.println("4. Fim");
    System.out.print("\nDigite a sua opção -->" );
    Scanner LerS = new Scanner(System.in);
    Opcao=LerS.nextInt();
    switch (Opcao)
    {case 1:
        System.out.println("\nLevantamentos");
        System.out.print("Quantia -->" );
        Quantia=LerS.nextDouble();
        System.out.println("Retire o talão");
        break;
        case 2:
            System.out.println ("\nDepósitos");
            System.out.print("Quantia -->" );
            Quantia=LerS.nextDouble();
            System.out.println("Introduza dinheiro ou cheque -->" );
            System.out.println ("Retire o talão");
            break;
        case 3:
            System.out.println ("\nPagamento de serviços");
            System.out.print("Entidade -->" );
            Entidade=LerS.nextInt();
            System.out.print("Referência -->" );
            Referencia=LerS.nextInt();
            System.out.print("Quantia -->" );
            Quantia=LerS.nextDouble();
            System.out.println("Retire o talão");
            break;
        case 4:
            System.out.println("\nFim");
            System.out.println("Retire o cartão");
            break;
        default:
            System.out.println("\nOpção inválida");}}}