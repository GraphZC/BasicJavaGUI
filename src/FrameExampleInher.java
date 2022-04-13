import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameExampleInher extends JFrame{
    public FrameExampleInher() {
        this.setTitle("Title"); // Frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setResizable(false);
        this.setVisible(true);

        /* Set panel icon image */
        ImageIcon image = new ImageIcon("icon.png");
        this.setIconImage(image.getImage());

        /* Set panel color */
        this.getContentPane().setBackground(Color.black);
        this.getContentPane().setBackground(new Color(125, 23, 56));
        this.getContentPane().setBackground(new Color(0xFFEE00));
    }
    public static void main(String[] args) {
        new FrameExampleInher();
    }

}