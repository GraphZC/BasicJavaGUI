import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Panel");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10)); // margin-x, margin-y
        // frame.setLayout(new FlowLayout(FlowLayout.LEADING)) // ชิดซ้าย
        // frame.setLayout(new FlowLayout(FlowLayout.TRAILING)) // ชิดขวา
        frame.setSize(500, 500);
        
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));


        frame.setVisible(true);
    }

}
