import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculoAreaBufferedReader {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Digite o valor da base do triângulo retângulo: ");
            double base = Double.parseDouble(reader.readLine());


            System.out.print("Digite o valor da altura do triângulo retângulo: ");
            double altura = Double.parseDouble(reader.readLine());

            double area = (base * altura) / 2;

            System.out.println("A área do triângulo retângulo é: " + area);

        } catch (IOException e) {
            System.out.println("Erro ao ler a entrada do usuário.");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira um número válido.");
        }
    }
}
