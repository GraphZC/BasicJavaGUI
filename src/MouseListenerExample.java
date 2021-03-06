import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends JFrame implements MouseListener{

    JLabel label;
    MouseListenerExample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You click the mouse in red zone");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered red zone");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited red zone");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse in red zone");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse in red zone");
        
    }
    public static void main(String[] e) {
        new MouseListenerExample();
    }
}
