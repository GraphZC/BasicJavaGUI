import java.awt.*;
import javax.swing.*;

public class Graphic2DPanel extends JPanel{
    Image image;

    Graphic2DPanel() {
        image = new ImageIcon("icon2.png").getImage();
            this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D =  (Graphics2D) g;

        // g2D.setPaint(Color.BLUE);
        g2D.setStroke(new BasicStroke(5));
        // g2D.drawLine(0, 0, 500, 500); // start x, start y, end x, end y

        // g2D.setPaint(Color.PINK);
        // g2D.drawRect(0, 0, 100, 200);
        // g2D.fillRect(0, 0, 100, 200);

        g2D.setPaint(Color.ORANGE);
        // g2D.drawOval(0, 0, 100, 100);
        // g2D.fillOval(0, 0, 100, 100);
        
        // g2D.drawArc(0, 0, 100, 100, 0, 180); // x, y, width , heigh, start rad, rad draw
        // g2D.fillArc(0, 0, 100, 100, 0, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};

        g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setFont(new Font("Prompt", Font.BOLD, 50));
        g2D.drawString("Hello World", 50, 50);

        g2D.drawImage(image, 0, 0, null);
    }
}
