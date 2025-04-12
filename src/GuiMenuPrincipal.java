import javax.swing.*;
import java.awt.*;

public class GuiMenuPrincipal extends JFrame {

    private JLabel lblStatus;

    public GuiMenuPrincipal() {
        super("Sistema - Menu Principal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());

        criarMenu();

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new GridLayout(2, 2, 10, 10));
        painelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painelCentral.add(criarBotaoModulo("Cadastro de Clientes", "clientes"));
        painelCentral.add(criarBotaoModulo("Cadastro de Produtos", "produtos"));
        painelCentral.add(criarBotaoModulo("Vendas", "vendas"));
        painelCentral.add(criarBotaoModulo("Relatórios", "relatorios"));

        // Cria a barra de status
        JPanel painelStatus = new JPanel();
        painelStatus.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelStatus.setBorder(BorderFactory.createEtchedBorder());

        lblStatus = new JLabel("Pronto");
        painelStatus.add(lblStatus);

        painelPrincipal.add(painelCentral, BorderLayout.CENTER);
        painelPrincipal.add(painelStatus, BorderLayout.SOUTH);

        add(painelPrincipal);
    }

    private void criarMenu() {
        JMenuBar menuBar = new JMenuBar();

        // Menu Arquivo
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');

        JMenuItem miSair = new JMenuItem("Sair");
        miSair.setMnemonic('S');
        miSair.addActionListener(e -> System.exit(0));

        menuArquivo.add(miSair);

        JMenu menuCadastros = new JMenu("Cadastros");
        menuCadastros.setMnemonic('C');

        JMenuItem miClientes = new JMenuItem("Clientes");
        miClientes.addActionListener(e -> abrirModulo("clientes"));

        JMenuItem miProdutos = new JMenuItem("Produtos");
        miProdutos.addActionListener(e -> abrirModulo("produtos"));

        menuCadastros.add(miClientes);
        menuCadastros.add(miProdutos);

        JMenu menuRelatorios = new JMenu("Relatórios");
        menuRelatorios.setMnemonic('R');

        JMenuItem miRelVendas = new JMenuItem("Vendas");
        miRelVendas.addActionListener(e -> abrirModulo("relatorios"));

        menuRelatorios.add(miRelVendas);

        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('u');

        JMenuItem miSobre = new JMenuItem("Sobre");
        miSobre.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Sistema de Gestão v1.0\n" +
                            "Exemplo simples de menu principal com Swing",
                    "Sobre o Sistema",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        menuAjuda.add(miSobre);

        menuBar.add(menuArquivo);
        menuBar.add(menuCadastros);
        menuBar.add(menuRelatorios);
        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);
    }

    private JButton criarBotaoModulo(String nome, String modulo) {
        JButton botao = new JButton(nome);
        botao.setPreferredSize(new Dimension(150, 80));
        botao.setFont(new Font("Arial", Font.BOLD, 12));

        botao.addActionListener(e -> abrirModulo(modulo));

        return botao;
    }

    private void abrirModulo(String modulo) {
        String mensagem = "";

        switch (modulo) {
            case "clientes":
                mensagem = "Módulo de Clientes";
                break;
            case "produtos":
                mensagem = "Módulo de Produtos";
                break;
            case "vendas":
                mensagem = "Módulo de Vendas";
                break;
            case "relatorios":
                mensagem = "Módulo de Relatórios";
                break;
            default:
                mensagem = "Módulo desconhecido";
        }

        lblStatus.setText("Abrindo: " + mensagem);

        JOptionPane.showMessageDialog(this,
                "O módulo '" + mensagem + "' seria aberto aqui.",
                "Abrir Módulo",
                JOptionPane.INFORMATION_MESSAGE);
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            GuiMenuPrincipal menu = new GuiMenuPrincipal();
            menu.setVisible(true);
        });
    }
}