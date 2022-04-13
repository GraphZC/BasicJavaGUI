import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Title"); // Frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setResizable(false);
        frame.setVisible(true);

        /* Set panel icon image */
        ImageIcon image = new ImageIcon();
        frame.setIconImage(image.getImage());

        /* Set panel color */
        frame.getContentPane().setBackground(Color.black);
        frame.getContentPane().setBackground(new Color(125,23,56));
        frame.getContentPane().setBackground(new Color(0xFFEE00));
    }
}
