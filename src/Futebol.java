import java.util.ArrayList;
import java.util.List;

public class Futebol {

    // Classe Jogador
    static class Jogador {
        private String nome;
        private int numeroCamisa;
        private String posicao;

        public Jogador(String nome, int numeroCamisa, String posicao) {
            this.nome = nome;
            this.numeroCamisa = numeroCamisa;
            this.posicao = posicao;
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public int getNumeroCamisa() {
            return numeroCamisa;
        }

        public String getPosicao() {
            return posicao;
        }

        @Override
        public String toString() {
            return nome + " (Camisa " + numeroCamisa + ", " + posicao + ")";
        }
    }

    // Classe Time
    static class Time {
        private String nome;
        private List<Jogador> jogadores;

        public Time(String nome) {
            this.nome = nome;
            this.jogadores = new ArrayList<>();
        }

        public void adicionarJogador(Jogador jogador) {
            jogadores.add(jogador);
        }

        public void listarJogadores() {
            System.out.println("Jogadores do time " + nome + ":");
            for (Jogador jogador : jogadores) {
                System.out.println(jogador);
            }
        }

        public String getNome() {
            return nome;
        }
    }

    // Classe Partida
    static class Partida {
        private Time time1;
        private Time time2;
        private int golsTime1;
        private int golsTime2;

        public Partida(Time time1, Time time2, int golsTime1, int golsTime2) {
            this.time1 = time1;
            this.time2 = time2;
            this.golsTime1 = golsTime1;
            this.golsTime2 = golsTime2;
        }

        public String getResultado() {
            return time1.getNome() + " " + golsTime1 + " x " + golsTime2 + " " + time2.getNome();
        }
    }

    // Classe Campeonato
    static class Campeonato {
        private List<Partida> partidas;

        public Campeonato() {
            this.partidas = new ArrayList<>();
        }

        public void adicionarPartida(Partida partida) {
            partidas.add(partida);
        }

        public void listarPartidas() {
            System.out.println("Partidas do campeonato:");
            for (Partida partida : partidas) {
                System.out.println(partida.getResultado());
            }
        }
    }

    // Classe Principal
    public static void main(String[] args) {
        // Criando jogadores
        Jogador jogador1 = new Jogador("Neymar", 10, "Atacante");
        Jogador jogador2 = new Jogador("Casemiro", 5, "Meio-campo");
        Jogador jogador3 = new Jogador("Messi", 10, "Atacante");
        Jogador jogador4 = new Jogador("De Jong", 21, "Meio-campo");

        // Criando times
        Time time1 = new Time("Brasil");
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);

        Time time2 = new Time("Argentina");
        time2.adicionarJogador(jogador3);
        time2.adicionarJogador(jogador4);

        // Listando jogadores dos times
        time1.listarJogadores();
        time2.listarJogadores();

        // Criando partidas
        Partida partida1 = new Partida(time1, time2, 2, 1);
        Partida partida2 = new Partida(time2, time1, 3, 3);

        // Criando campeonato e adicionando partidas
        Campeonato campeonato = new Campeonato();
        campeonato.adicionarPartida(partida1);
        campeonato.adicionarPartida(partida2);

        // Listando partidas do campeonato
        campeonato.listarPartidas();
    }
}