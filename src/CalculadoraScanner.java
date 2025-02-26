import java.util.Scanner;

public class CalculadoraScanner {
    public static double media(double p1, double p2, double trabalho) {
        return ((3.5 * p1) + (3.5 * 2) + (3 * trabalho));
    }
        public static void main(String[] args) {
            double p1 = 0, p2 = 0, trabalho = 0;

            try {
                System.out.println("Entre com a nota P1: ");

                Scanner leitura = new Scanner(System.in);

                double leituraP1 = leitura.nextDouble();

                System.out.println("Entre com a nota da P2: ");
                double leituraP2 = leitura.nextDouble();

                System.out.println("Entre com a nota do trabalho: ");
                double leituraTrabalho = leitura.nextDouble();

                System.out.println("A média é: " +  media(p1, p2, trabalho));
            }
            catch (NumberFormatException erro) {
                System.out.println("Erro de Conversão!" + erro.toString());
            }
        }
}
