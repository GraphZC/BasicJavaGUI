import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample extends JFrame implements KeyListener {
    
    JLabel label;
    ImageIcon icon;


    KeyListenerExample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("icon2.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setOpaque(true);
        label.setIcon(icon);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // System.out.println("You released key char: " + e.getKeyChar());
        switch(e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY()); // position x, position y
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10); // position x, position y
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10); // position x, position y
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY()); // position x, position y
                break;
        }
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
