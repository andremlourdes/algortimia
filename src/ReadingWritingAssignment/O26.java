package ReadingWritingAssignment;

public class O26 {
    public static void main(String[] args) {
        int Valor1, Valor2;
        int Variacao = 10;

        Valor1 = Variacao++;
        System.out.println("Incrementador posfixo: primeiro atribui o valor e depois incrementa");
        System.out.printf("Valor1=%d e Variacao=%d\n", Valor1, Variacao);

        Variacao = 10;
        Valor1 = ++Variacao;
        System.out.println("Incrementador prefixo: primeiro incrementa e depois atribui o valor");
        System.out.printf("Variacao=%d e Valor1=%d \n", Variacao, Valor1);

        Variacao = 10;
        Valor2 = Variacao--;
        System.out.println("Decrementador posfixo: primeiro atribui o valor e depois decrementa");
        System.out.printf("Valor2=%d e Variacao=%d \n", Valor2, Variacao);

        Variacao = 10;
        Valor2 = --Variacao;
        System.out.println("Decrementador prefixo: primeiro decrementa e depois atribui o valor");
        System.out.printf("Variacao=%d e Valor2=%d\n", Variacao, Valor2);
    }
}