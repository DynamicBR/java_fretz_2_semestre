import java.util.Scanner;

public class ContaBancariaScanner {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 0;
        double retirar, depositar;
        int opcao;

        do {
            String menu = """
                    [1] Consultar Saldo
                    [2] Depositar
                    [3] Retirar 
                    [4] Sair
                    """;
            System.out.println(menu);
            System.out.println("Qual opção deseja?:");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(String.format("Seu saldo atual: %.2f", saldo));
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar:");
                depositar = leitura.nextDouble();
                saldo += depositar;
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja retirar:");
                retirar = leitura.nextDouble();
                saldo -= retirar;
                if (saldo < 0) {
                    System.out.println("Não é possivel retirar. Não hà saldo na conta.");
                }
            }
        } while (opcao != 4);
    }
}
