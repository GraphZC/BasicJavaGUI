import javax.swing.JFrame;

public class DragDropFrame extends JFrame{
    DragDropPanel dragPanel = new DragDropPanel();
    DragDropFrame() {
        this.setTitle("Drag Drop");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(dragPanel);
    }
    public static void main(String[] args) {
        new DragDropFrame();
    }
}
