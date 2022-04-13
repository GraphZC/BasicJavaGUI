import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelExample {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("icon.png");

        JLabel label = new JLabel();
        label.setText("HELLO");
        label.setIcon(icon);
        label.setBounds(0, 0, 500, 500);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 500, 500);
        redPanel.add(label);
        redPanel.setLayout(new BorderLayout()); // reset layout เป็นเหมือนทีแรก อยู่ center vertical แล้วก็ชิดซ้าย

        JPanel bluPanel = new JPanel();
        bluPanel.setBackground(Color.BLUE);
        bluPanel.setBounds(500, 0, 500, 500);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Panel");
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluPanel);
    }
}
