import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome!");

        String aux="";
        double nota1 = 0, nota2 = 0, trabalho = 0, media = 0;

        try {
            aux = JOptionPane.showInputDialog("Entre com a nota 1: ");

            nota1 = Float.parseFloat(aux);
            nota2 = Float.parseFloat(aux);

            aux=JOptionPane.showInputDialog("Entre com a nota de trabalho");

            trabalho = Float.parseFloat(aux);

            media = (nota1 + nota2) / 3;

            JOptionPane.showMessageDialog(null, "Média: " + media(nota1, nota2, trabalho));
        }

        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão. Digite caracteres numéricos: " + erro);
        }
        System.exit(0);
    }
    public static double media(double nota1, double nota2, double trabalho) {
        return (nota1 + nota2 + trabalho) / 3;
    }
}
