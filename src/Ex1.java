import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Cálculo IMC");

        System.out.println("Digite sua altura:");
        double altura = leitura.nextDouble();

        System.out.println("Digite o seu peso:");
        double peso = leitura.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println(String.format("O seu IMC é: %.2f", imc));
    }
}
