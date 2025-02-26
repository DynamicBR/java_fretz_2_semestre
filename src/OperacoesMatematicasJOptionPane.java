import javax.swing.JOptionPane;

public class OperacoesMatematicasJOptionPane {
    public static void main(String[] args) {
        try {

            String inputV1 = JOptionPane.showInputDialog("Digite o primeiro valor (v1):");
            double v1 = Double.parseDouble(inputV1);

            String inputV2 = JOptionPane.showInputDialog("Digite o segundo valor (v2):");
            double v2 = Double.parseDouble(inputV2);

            double soma = v1 + v2;
            double subtracao = v1 - v2;
            double multiplicacao = v1 * v2;
            double divisao = v1 / v2;

            String mensagem = "Resultados das operações:\n" +
                    "Soma: " + soma + "\n" +
                    "Subtração: " + subtracao + "\n" +
                    "Multiplicação: " + multiplicacao + "\n" +
                    "Divisão: " + divisao;

            JOptionPane.showMessageDialog(null, mensagem);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite apenas números.");
        }
    }
}
