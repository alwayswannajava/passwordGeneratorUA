import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GUI extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label3;
    private String input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890`!@#$%^&*()-_+/,<>";
    private ImageIcon image1;

    public GUI() {
        setLayout(new FlowLayout());
        image1 = new ImageIcon(getClass().getResource("padlock_104912.png"));
        label3 = new JLabel(image1);
        add(label3);
        add(panel1);
        setSize(500, 300);
        setTitle("Генератор паролю ");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Character> characters = new ArrayList<Character>();
                for (char c : input.toCharArray()) {
                    characters.add(c);
                }
                int size = Integer.parseInt(textField1.getText());
                StringBuilder output = new StringBuilder(input.length());
                while (characters.size() != 0) {
                    int randPicker = (int) (Math.random() * characters.size());
                    output.append(characters.remove(randPicker));
                }
                for (int i = 0; i < size; i++) {
                    output.delete(size, output.length());
                }
                textField2.setText(output.toString());
                textField2.getText();

            }
        });
    }
}
