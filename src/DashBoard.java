import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame {

    private JPanel pnlMain;

    public DashBoard(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pnlMain.setPreferredSize(new Dimension(400, 300));
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            DashBoard app = new DashBoard();
            app.setVisible(true);
        });
    }
}
