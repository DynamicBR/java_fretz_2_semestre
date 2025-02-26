import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaComBufferedReader  {
    public static void main(String[] args) {
        String s = "";
        double reais, dolar;
        BufferedReader dado;

        try {
            System.out.println("Entre com valor em Dolar");
            dado = new BufferedReader(new InputStreamReader(System.in));

            s = dado.readLine();
            dolar = Double.parseDouble(s);

            System.out.println("Qual a cotação do Dolar");
            s = dado.readLine();

            double cotacao = Double.parseDouble(s);
            double conversao = dolar * cotacao;

            System.out.println("O valor da cotação de D[olar é " + conversaoDolarParaReais(dolar, cotacao));
        }
        catch (IOException erro) {
            System.out.println("Houve um erro na entrada de dados");
        }
        catch (NumberFormatException erro) {
            System.out.println("Digite apenas números");
        }
    }
    public static double conversaoDolarParaReais (double dolar, double contacaoDolarEmReais) {
        return  dolar * contacaoDolarEmReais;
    }
}
