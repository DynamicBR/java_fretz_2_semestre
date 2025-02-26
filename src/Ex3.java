import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número final da placa:");
        int placa = leitura.nextInt();

        switch (placa % 10) {
            case 1: case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3: case 4:
                System.out.println("Terça-Feira");
                break;
            case 5: case 6:
                System.out.println("Quarta-Feira");
                break;
            case 7: case 8:
                System.out.println("Quinta-Feira");
                break;
            case 9: case 10:
                System.out.println("Sexta-Feira");
                break;
            default:
        }
    }
}
