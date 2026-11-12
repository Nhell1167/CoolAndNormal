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

        btnRegister.addActionListener(e->{
            char[] p1 = pfPass1.getPassword();
            char[] p2 = pfPass2.getPassword();
            StringBuilder str = new StringBuilder();
            for(char a : p1){
                str.append(a);
            }
            StringBuilder st = new StringBuilder();
            for(char a : p2){
                st.append(a);
            }

            if(!str.toString().equalsIgnoreCase(st.toString())){
                JOptionPane.showMessageDialog(pnlMain, "Mismatch Password!");
                pfPass1.setText("");
                pfPass1.setText("");
            }else{
                SwingUtilities.invokeLater(()->{});
            }
        });


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
