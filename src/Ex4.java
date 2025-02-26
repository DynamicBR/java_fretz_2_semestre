import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero, fatorial;

        System.out.println("Digite um número para ver o seu fatorial:");
        numero = leitura.nextInt();

        fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial += i;
        }
        System.out.println(String.format("O fatorial de %d é igual à %d", numero, fatorial));
    }
}
