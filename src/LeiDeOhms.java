public class LeiDeOhms {
    public double I = 1;
    public double U = 110;
    public char I_unidade = 'A';
    public char U_unidade = 'V';
    public double resistencia;
    String R_unidade = "Ohms";

    public void CalculaResistencia() {
        System.out.println("A corrente dada " + I + " " + I_unidade);
        System.out.println("A tensão dada " + U + " " + U_unidade);
        System.out.println("A resistência será: " + resistencia + " " + R_unidade);
    }
}
class LeiOhmsTest {
    public static void main(String[] args) {
        LeiDeOhms objLeiDeOhms = new LeiDeOhms();
        objLeiDeOhms.CalculaResistencia();
    }
}
