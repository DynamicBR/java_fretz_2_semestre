import javax.swing.JOptionPane;

public class InternetDownloadJOptionPane {
    public static void main(String[] args) {

        final double VELOCIDADE_INTERNET = 2.0;

        try {
            String inputTamanho = JOptionPane.showInputDialog("Digite o tamanho do arquivo em bytes:");
            double tamanhoBytes = Double.parseDouble(inputTamanho);

            double tamanhoBits = tamanhoBytes * 8;

            double tempoSegundos = tamanhoBits / (VELOCIDADE_INTERNET * 1_000_000);

            JOptionPane.showMessageDialog(null,
                    "Tempo necessário para o download: " + tempoSegundos + " segundos.");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite apenas números.");
        }
    }
}
