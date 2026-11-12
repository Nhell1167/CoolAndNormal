import javax.swing.*;

public class MemberRegister extends JFrame{
    private JPanel pnlMain;
    private JTextField tfEmail;
    private JCheckBox cbConfirmPass;
    private JButton btnRegister;
    private JPasswordField pfPass1;
    private JPasswordField pfPass2;

    public MemberRegister(){
        setContentPane(pnlMain);
        setSize(800, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pfPass1.setEchoChar('*');
        pfPass2.setEchoChar('*');
    }



    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MemberRegister a = new MemberRegister();
            }
        });
    }
}
