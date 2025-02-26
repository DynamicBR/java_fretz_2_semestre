import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero, soma;

        System.out.println("Digite um número:");
        numero = leitura.nextInt();

        soma = 0;
        while (numero> 0) {
            soma += numero % 10;
            numero /= 10;
        }
        System.out.println(String.format("A soma dos dígitos é: %d", soma));
    }
}
