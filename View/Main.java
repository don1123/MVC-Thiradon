import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        JButton button = new JButton("START");
        button.setBounds(100,100,200,50);
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
            }
            
        });
        panel.add(button);
        frame.setVisible(true);
    }
}