public class Ex7 {
    public static int fatorial (int numero) {
        int calculoFatorial = 1;

        for (int i = 2; i <= numero; i++) {
            calculoFatorial *= i;
        }
        return calculoFatorial;
    }

    public static void main(String[] args) {
        System.out.println(String.format("O fatorial de 2 é %d", fatorial(2)));
    }
}
