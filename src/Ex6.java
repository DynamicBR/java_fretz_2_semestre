import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random gerarNumeroAleatorio = new Random();

        int limite, chute, numeroSecreto;

        limite = 10;
        numeroSecreto = gerarNumeroAleatorio.nextInt(limite);

        do {
            System.out.println("Digite um chute entra 1 à 10:");
            chute = leitura.nextInt();

            if (chute < numeroSecreto) {
                System.out.println("Chute baixo!");
            }
            else if (chute > numeroSecreto) {
                System.out.println("Chute alto!");
            }
        } while (numeroSecreto != chute);
        System.out.println("Parabéns! Você ganhou!");
    }
}
