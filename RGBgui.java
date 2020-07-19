import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RGBgui implements ActionListener {
    JFrame frame;
    JPanel panel;
    JTextField txtBoxR;
    JTextField txtBoxG;
    JTextField txtBoxB;
    JButton setButton;
    JLabel labelR;
    JLabel labelG;
    JLabel labelB;

    public RGBgui() {

        frame = new JFrame();
        panel = new JPanel();
        txtBoxR = new JTextField(5);
        txtBoxG = new JTextField(5);
        txtBoxB = new JTextField(5);
        setButton = new JButton("Set Color");
        labelR = new JLabel("R Value");
        labelG = new JLabel("G Value");
        labelB = new JLabel("B Value");
        setButton.setPreferredSize(new Dimension(100, 20));
        setButton.setAlignmentX(0);

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new FlowLayout());
        panel.add(labelR);
        panel.add(txtBoxR);
        panel.add(labelG);
        panel.add(txtBoxG);
        panel.add(labelB);
        panel.add(txtBoxB);
        panel.add(setButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Have fun going blind!");
        frame.pack();

        setButton.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(final String[] args) {
        new RGBgui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int RValue = Integer.parseInt(txtBoxR.getText());
        int GValue = Integer.parseInt(txtBoxG.getText());
        int BValue = Integer.parseInt(txtBoxB.getText());
        
        panel.setBackground(new Color(RValue, GValue, BValue));
    }
}