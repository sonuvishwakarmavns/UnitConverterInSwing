import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dynamic Size Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JButton button = new JButton("Dynamic Button");

        frame.setLayout(null); // Using no layout manager
        button.setBounds(50, 50, 200, 100);
        frame.add(button);

        frame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                Dimension size = frame.getSize();
                button.setBounds(size.width / 4, size.height / 4, size.width / 2, size.height / 2);
            }
        });

        frame.setVisible(true);
    }
}
