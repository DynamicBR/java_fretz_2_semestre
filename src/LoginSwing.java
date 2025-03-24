import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSwing extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;

    public LoginSwing() {
        // Configurações da janela
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5)); // 3 linhas, 2 colunas, espaçamento de 5px

        // Componentes da interface
        JLabel usernameLabel = new JLabel("Usuário:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Senha:");
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancelar");

        // Adiciona componentes ao painel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(cancelButton);

        // Adiciona o painel à janela
        add(panel);

        // Configuração dos eventos dos botões
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Verificação simples de login
                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(LoginSwing.this, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(LoginSwing.this, "Usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpa os campos e fecha a aplicação
                usernameField.setText("");
                passwordField.setText("");
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // Executa a interface
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginSwing loginInterface = new LoginSwing();
                loginInterface.setVisible(true);
            }
        });
    }
}