import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class lab10 extends JFrame {
    lab10(){
        setTitle("Swing button with Inheritance");
        setLayout(null);
        JButton b=new JButton("Click Me!");
        b.setBounds(100,100,120,40);
        add(b);
        b.addActionListener(new ActionListener(){
            public void ActionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Button clicked!");
                
            }        
        });
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new lab10();
            }
        });
    }
    
}
