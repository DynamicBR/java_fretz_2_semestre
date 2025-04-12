import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

class GuiBotao extends JFrame {

    private JButton btnSimples;
    private JButton btnComImagem;
    private JToggleButton btnAlternado;
    private JRadioButton rbOpcao1;
    private JRadioButton rbOpcao2;
    private JRadioButton rbOpcao3;
    private JCheckBox cbOpcaoA;
    private JCheckBox cbOpcaoB;
    private JTextArea taResultado;
    private JLabel lblStatus;

    public GuiBotao() {
        super("Demonstração de Botões Swing");
        inicializarComponentes();
        definirEventos();
        configurarJanela();
    }

    private void inicializarComponentes() {
        setLayout(new BorderLayout());

        JPanel painelBotoes = new JPanel(new GridLayout(3, 1, 10, 10));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel painelBotoesSimples = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelBotoesSimples.setBorder(BorderFactory.createTitledBorder("Botões Simples"));

        btnSimples = new JButton("Clique Aqui");

        ImageIcon icone = null;
        try {
            icone = new ImageIcon(getClass().getResource("/recursos/icone.png"));
            if (icone.getImageLoadStatus() != MediaTracker.COMPLETE) {
                icone = criarIconePadrao();
            }
        } catch (Exception e) {
            icone = criarIconePadrao();
        }

        btnComImagem = new JButton("Botão com Imagem", icone);

        painelBotoesSimples.add(btnSimples);
        painelBotoesSimples.add(btnComImagem);

        JPanel painelBotoesAlternados = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelBotoesAlternados.setBorder(BorderFactory.createTitledBorder("Botão de Alternância"));

        btnAlternado = new JToggleButton("Alternar Estado");
        painelBotoesAlternados.add(btnAlternado);

        JPanel painelRadioButtons = new JPanel(new GridLayout(3, 1));
        painelRadioButtons.setBorder(BorderFactory.createTitledBorder("Botões de Opção (RadioButton)"));

        rbOpcao1 = new JRadioButton("Opção 1");
        rbOpcao2 = new JRadioButton("Opção 2");
        rbOpcao3 = new JRadioButton("Opção 3");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbOpcao1);
        grupo.add(rbOpcao2);
        grupo.add(rbOpcao3);

        rbOpcao1.setSelected(true);

        painelRadioButtons.add(rbOpcao1);
        painelRadioButtons.add(rbOpcao2);
        painelRadioButtons.add(rbOpcao3);

        JPanel painelCheckBoxes = new JPanel(new GridLayout(2, 1));
        painelCheckBoxes.setBorder(BorderFactory.createTitledBorder("Caixas de Seleção (CheckBox)"));

        cbOpcaoA = new JCheckBox("Opção A");
        cbOpcaoB = new JCheckBox("Opção B");

        painelCheckBoxes.add(cbOpcaoA);
        painelCheckBoxes.add(cbOpcaoB);

        painelBotoes.add(painelBotoesSimples);

        JPanel painelLinha2 = new JPanel(new GridLayout(1, 2));
        painelLinha2.add(painelBotoesAlternados);
        painelLinha2.add(painelRadioButtons);
        painelBotoes.add(painelLinha2);

        painelBotoes.add(painelCheckBoxes);

        taResultado = new JTextArea(5, 30);
        taResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taResultado);

        lblStatus = new JLabel("Pronto");
        JPanel painelStatus = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelStatus.setBorder(BorderFactory.createEtchedBorder());
        painelStatus.add(lblStatus);

        add(painelBotoes, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(painelStatus, BorderLayout.SOUTH);
    }

    private ImageIcon criarIconePadrao() {
        BufferedImage image = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.BLUE);
        g2d.fillOval(0, 0, 16, 16);
        g2d.dispose();
        return new ImageIcon(image);
    }

    private void definirEventos() {
        // Evento do botão simples
        btnSimples.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarTextoResultado("Botão Simples clicado");
                lblStatus.setText("Botão Simples acionado");
            }
        });

        btnComImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarTextoResultado("Botão com Imagem clicado");
                lblStatus.setText("Botão com Imagem acionado");
            }
        });

        btnAlternado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JToggleButton btn = (JToggleButton) e.getSource();
                String status = btn.isSelected() ? "ATIVADO" : "DESATIVADO";
                adicionarTextoResultado("Botão de Alternância: " + status);
                lblStatus.setText("Botão de Alternância: " + status);
            }
        });

        ActionListener radioListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton btn = (JRadioButton) e.getSource();
                adicionarTextoResultado("Selecionado: " + btn.getText());
                lblStatus.setText("Opção selecionada: " + btn.getText());
            }
        };

        rbOpcao1.addActionListener(radioListener);
        rbOpcao2.addActionListener(radioListener);
        rbOpcao3.addActionListener(radioListener);

        ActionListener checkListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                String status = cb.isSelected() ? "marcada" : "desmarcada";
                adicionarTextoResultado(cb.getText() + " foi " + status);
                atualizarStatusCheckboxes();
            }
        };

        cbOpcaoA.addActionListener(checkListener);
        cbOpcaoB.addActionListener(checkListener);
    }

    private void atualizarStatusCheckboxes() {
        StringBuilder sb = new StringBuilder("Opções selecionadas: ");
        boolean nenhumaSelecionada = true;

        if (cbOpcaoA.isSelected()) {
            sb.append("A ");
            nenhumaSelecionada = false;
        }

        if (cbOpcaoB.isSelected()) {
            sb.append("B ");
            nenhumaSelecionada = false;
        }

        if (nenhumaSelecionada) {
            sb.append("Nenhuma");
        }

        lblStatus.setText(sb.toString());
    }

    /**
     * Adiciona texto à área de resultado
     */
    private void adicionarTextoResultado(String texto) {
        taResultado.append(texto + "\n");
        // Rola para o final do texto
        taResultado.setCaretPosition(taResultado.getDocument().getLength());
    }

    /**
     * Configura as propriedades da janela
     */
    private void configurarJanela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 450);
        setLocationRelativeTo(null); // Centraliza na tela
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiBotao();
            }
        });
    }
}