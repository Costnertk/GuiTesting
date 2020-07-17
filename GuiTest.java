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
    JButton buttonAdd;
    JButton buttonSub;

    public GuiTest(){
        JFrame frame = new JFrame();
        buttonAdd = new JButton("Add");
        buttonSub = new JButton("Subtract");
        label = new JLabel("Number of Clicks : 0");
        JPanel panel = new JPanel();
        label.getBounds()
        panel.setBorder(BorderFactory.createEmptyBorder(50,150,50,150));
        panel.setLayout(new GridLayout(2,2));
        panel.add(buttonAdd);
        panel.add(buttonSub);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new GuiTest();
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source == buttonAdd){
            count++;
        }
        else if(source == buttonSub){
            count--;
        }
        label.setText("Number of Clicks: " + count);
    }
}