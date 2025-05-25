package conditionalStructures;

import java.util.Scanner;
public class C9
{public static void main(String[] args) throws Exception
{final int Limaximo=270, Limedio=180;
    double Totvendas,Percpronto,Clidiv,Letcart, Letdesc;
    double Vcredito, Total, Prazomedio;
    String Interpreta="";
    System.out.print("Total de vendas? ");
    Scanner LerS = new Scanner(System.in);
    Totvendas=LerS.nextDouble();
    System.out.print("Percentagem de pagamento a pronto? ");
    Percpronto= LerS.nextDouble();
    System.out.print("Dívidas de clientes? ");
    Clidiv= LerS.nextDouble();
    System.out.print("Letras a receber em carteira? ");
    Letcart= LerS.nextDouble();
    System.out.print("Letras a receber descontadas? ");
    Letdesc= LerS.nextDouble();
    Vcredito=Totvendas*(1-Percpronto/100);
    Total=Clidiv+Letcart+Letdesc;
    Prazomedio=Total * 365 / Vcredito;
    if (Prazomedio>= Limaximo)
        Interpreta="EXCESSIVO";
    else if (Prazomedio>=Limedio)
        Interpreta="SATISFATÓRIO";
    else Interpreta="FAVORÁVEL";
    System.out.printf(String.format("%5.2f dias --- %s",Prazomedio,
            Interpreta));}}