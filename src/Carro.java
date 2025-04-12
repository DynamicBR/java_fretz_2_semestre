public class Carro {
    public int velocidadeInicial = 0;
    public int velocidadeFinal = 20;
    public int aceleracao = 20;
    public int distancia = 20;
    public int tempo = 2;

    public void mostraCarro() {
        System.out.println(String.format("Velocidade Inicial: %d", velocidadeInicial));
        System.out.println(String.format("Velocidade Final: %d", velocidadeFinal));
        System.out.println(String.format("Aceleração: %d", aceleracao));
        System.out.println(String.format("Distância: %d", distancia));
        System.out.println(String.format("Tempo: %d", tempo));
    }
}


