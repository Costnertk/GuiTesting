import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiTest implements ActionListener{

    private int count = 0;
    JLabel label;
    
    public GuiTest(){
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");
        label = new JLabel("Number of Clicks : 0");
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

        button.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new GuiTest();
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: " + count);
    }
}