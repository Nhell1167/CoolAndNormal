import javax.swing.*;
import java.awt.Dimension;
import java.io.*;

public class MemberRegister extends JFrame{
    private JPanel pnlMain;
    private JTextField tfEmail;
    private JCheckBox cbshow;
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

        cbshow.addActionListener(e -> {
            if (cbshow.isSelected()) {
                pfPass1.setEchoChar((char) 0);
                pfPass2.setEchoChar((char) 0);
            } else {
                pfPass1.setEchoChar('*');
                pfPass2.setEchoChar('*');
            }
        });

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
                pfPass2.setText("");
            }else{
                try(BufferedWriter writer = new BufferedWriter(new FileWriter("RegisteredUsers.txt", true))){
                    writer.write(tfEmail.getText() + " " + pfPass1.getText());
                    writer.write("\n");
                }catch(IOException v){
                    v.printStackTrace();
                }
                SwingUtilities.invokeLater(()->{});
                GymMembership login = new GymMembership();
                login.setVisible(true);
                this.dispose(); // Close the login form

            }




        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pnlMain.setPreferredSize(new Dimension(400, 300));
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
