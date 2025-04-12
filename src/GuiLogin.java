import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLogin extends JFrame {
    private JTextField tfLogin;
    private JLabel lbSenha;
    private JLabel lblogin;
    private JButton btlogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GuiLogin frame;

    private void inicializaCompoentes() {
        setTitle("Login do Sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);

        tfLogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        lbSenha = new JLabel("Senha");
        lblogin = new JLabel("Login");
        btlogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");

        tfLogin.setBounds(100, 30, 120, 25);
        lblogin.setBounds(30, 30, 80, 25);
        lbSenha.setBounds(30, 75, 80, 25);
        pfSenha.setBounds(100, 75, 120, 25);
        btlogar.setBounds(20, 120, 100, 25);
        btCancelar.setBounds(125, 120, 100, 25);

        add(tfLogin);
        add(lblogin); // Erro corrigido: label de login não estava sendo adicionado
        add(lbSenha);
        add(btlogar);
        add(btCancelar);
        add(pfSenha);
    }

    private void definirEventos() {
        btlogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(pfSenha.getPassword());
                if(tfLogin.getText().equals("java8") && senha.equals("JAVA8")) {
                    frame.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha incorreta");
                }
            }
        });

        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private GuiLogin(){
        inicializaCompoentes();
        definirEventos();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new GuiLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                // Corrigido o cálculo para centralizar a janela na tela
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
        // Removida a linha que criava uma instância adicional desnecessária
    }
}