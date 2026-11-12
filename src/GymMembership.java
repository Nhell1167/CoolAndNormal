import javax.swing.*;
import java.awt.Dimension;

public class GymMembership extends JFrame {

    private JPanel pnlMain;
    private JTextField tfName;
    private JPasswordField pfPassword;
    private JButton btnLogin;
    private JButton btnRegister;
    private JLabel lblName;
    private JLabel lblPassword;
    private JPanel pnlLogin;

    public GymMembership() {

        setContentPane(pnlMain);

        setTitle("Gym Membership Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pnlLogin.setPreferredSize(new Dimension(400, 300));
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            GymMembership app = new GymMembership();
            app.setVisible(true);
        });
    }
}