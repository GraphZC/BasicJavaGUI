import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample extends JFrame implements ActionListener { 
    private JButton button;

    ButtonExample() {
        ImageIcon icon = new ImageIcon("icon2.png");

        button = new JButton();
        button.setBounds(150, 125, 250, 300);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("Hello"));
        button.setText("Button");
        button.setFocusable(false); // แก้ขอบของปุ่ม
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        // button.setEnabled(false); make button disable

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Button Example");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hello");
            // button.setEnabled(false); make button can click at once
        } 
    }

    public static void main(String[] args) {
        new ButtonExample();
        
    }
}
