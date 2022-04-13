import javax.swing.*;

public class Graphic2DFrame extends JFrame {

    Graphic2DPanel panel;

    Graphic2DFrame() {
        panel = new Graphic2DPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setSize(500, 500);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    // public void paint(Graphics g) {
    //     Graphics2D g2D =  (Graphics2D) g;
    //     g2D.drawLine(0, 0, 500, 500); // start x, start y, end x, end y
    // }

    public static void main(String[] args) {
        new Graphic2DFrame();
    }
}
