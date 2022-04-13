import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OptionPaneExample {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Hello World", "Greeting", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hello World", "Greeting", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hello World", "Greeting", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hello World", "Greeting", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hello World", "Greeting", JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "Are you confirm", "Select", JOptionPane.YES_NO_CANCEL_OPTION); // yes = 0, no = 1, cancel = 2 
        // System.out.println(answer);

        // String name = JOptionPane.showInputDialog("Your name: ");
        // System.out.println(name);
        String[] btnMsg = {"Y", "N", "C"};
        ImageIcon icon = new ImageIcon("icon2.png");
        JOptionPane.showOptionDialog(null, "Hello World", "Title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, btnMsg, 0);
    }
}
