public class Exemplo0305 {
    public static void main(String[] args) {
        int x = 10, y = 0, z = 0;

        try {
            if (y == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
                // Podemos também lançar uma exceção personalizada aqui se preferir
                // throw new ArithmeticException("Divisão por zero não é permitida");
            } else {
                z = x / y;
                System.out.println("Resultado da divisão: " + z);
            }
        }
        catch (Exception e) {
            System.out.println("Mensagem de erro: " + e.getMessage());
            e.printStackTrace();
        }

        // Continuação do programa após tratamento do erro
        System.out.println("Programa finalizado com sucesso.");
    }
}