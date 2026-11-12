import javax.swing.*;

public class GymMembership extends JFrame{
    private JTextField tfName;
    private JTextField tfPassword;
    private JPanel pnlMain;
    private JLabel lblName;
    private JLabel lblPassword;
    private JButton btnLogin;
    private JButton btnRegister;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GymMembership app = new GymMembership();
            app.setContentPane(app.pnlMain);
            app.setSize(500, 250);
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
            app.setTitle("Login Form");
            app.setLocationRelativeTo(null);
            app.setVisible(true);
        });
    }
}
