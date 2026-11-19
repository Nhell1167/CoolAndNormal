import javax.swing.*;
import java.awt.Dimension;
import java.io.*;

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

        btnLogin.addActionListener(e->{
            try(BufferedReader reader= new BufferedReader(new FileReader("RegisteredUsers.txt"))){
                String line;
                while((line = reader.readLine())!= null) {
                    String[] verify = line.split(" ");
                    if (verify[0].equals(tfName.getText()) && verify[1].equals(pfPassword.getText())) {
                        DashBoard board = new DashBoard();
                        board.setVisible(true);

                        this.dispose();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(pnlMain, "Account Is Not Registered");
                tfName.setText("");
                pfPassword.setText("");
            }catch(IOException v){
                v.printStackTrace();
            }

        });

        btnRegister.addActionListener(e -> {
            MemberRegister register = new MemberRegister();
            register.setVisible(true);

            this.dispose();
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            GymMembership app = new GymMembership();
            app.setVisible(true);
        });
    }
}