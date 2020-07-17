import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
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
    JPanel panel;

    public GuiTest(){
        JFrame frame = new JFrame();
        buttonAdd = new JButton("Add");
        buttonSub = new JButton("Subtract");
        label = new JLabel("Number of Clicks : 0");
        panel = new JPanel();
        
        panel.setBorder(BorderFactory.createEmptyBorder(50,150,50,150));
        //panel.setLayout(new GridLayout(2,2));
        panel.add(buttonAdd);
        panel.add(buttonSub);
        panel.add(label);
        
        /*
        panel.setBackground(new Color(11,155, 226));
        buttonAdd.setBackground(new Color(114,235,83));
        buttonSub.setBackground(new Color(114,235,83));
        buttonAdd.setForeground(new Color(225,235,83));
        buttonSub.setForeground(new Color(225,235,83));
        label.setForeground(new Color(46,226,11));
        */

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);

        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GuiTest();
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source == buttonAdd){
            count++;
            panel.setBackground(new Color(0,255, 0));
        }
        else if(source == buttonSub){
            count--;
            panel.setBackground(new Color(255,0,0));
        }
        label.setText("Number of Clicks: " + count);
    }
}