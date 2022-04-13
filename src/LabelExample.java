import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class LabelExample {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xFF22F2));
        label.setFont(new Font("Prompt", Font.PLAIN, 20));   // font name, font style, font size
        label.setIconTextGap(20); // Vertical distance of icon and text
        label.setBackground(new Color(0x000000));
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0, 0, 500, 500);

        ImageIcon image = new ImageIcon("icon.png");
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setTitle("Title"); // Frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(1000, 700);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // show only label bounds
    }
}
