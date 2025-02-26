import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Cálculo IMC");

        System.out.println("Digite sua altura:");
        double altura = leitura.nextDouble();

        System.out.println("Digite o seu peso:");
        double peso = leitura.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println(String.format("Seu imc é: %.2f", imc));

        if (imc >= 30) {
            System.out.println("Você está obeso.");
        }
        else if (imc < 18.5) {
            System.out.println("Você está magro.");
        }
        else {
            System.out.println("Você está saudável.");
        }
    }
}
