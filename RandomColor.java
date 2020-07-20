import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomColor implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton button;

    public RandomColor() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Start/Stop");

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Flashing Lights!!!!!");
        frame.pack();

        button.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RandomColor();
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        int RValue = (int) (Math.random() * 255);
        int GValue = (int) (Math.random() * 255);
        int BValue = (int) (Math.random() * 255);
        panel.setBackground(new Color(RValue, GValue, BValue));
    }
}
