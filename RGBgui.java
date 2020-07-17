import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class RGBgui {
    JFrame frame;
    JPanel panel;
    JTextField txtBoxR;
    JTextField txtBoxG;
    JTextField txtBoxB;
    JButton setButton;

    public RGBgui() {

        frame = new JFrame();
        panel = new JPanel();
        txtBoxR = new JTextField();
        txtBoxG = new JTextField();
        txtBoxB = new JTextField();
        setButton = new JButton();

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout();
        panel.add(txtBoxR);
        panel.add(txtBoxG);
        panel.add(txtBoxB);
        panel.add(setButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Have fun going blind!");
        frame.pack();

        
        
        
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RGBgui();
    }
}