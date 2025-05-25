package conditionalStructures;

public class C2
{public static void main(String[] args)
{final int Meiodia=12;
    Long Horacorrente=System.currentTimeMillis();
    int H=Integer.valueOf(String.format("%1$tH", Horacorrente));
    String Msg="";
    if (H<Meiodia)
        Msg="Bom dia";
    else
        Msg="Boa tarde";
    System.out.println(Msg);}}