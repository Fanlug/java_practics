
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

class ImageLol extends JFrame {
    JTextArea textArea = new JTextArea();
    JButton button = new JButton();
    BufferedImage image;
    JLabel label = new JLabel();
    public ImageLol() {
        setLayout(new FlowLayout());
        add(textArea);
        add(button);
        button.addActionListener(e -> {
            File pathToFile = new File(textArea.getText());
            try {
                image = ImageIO.read(pathToFile);
                label.setIcon(new ImageIcon(image));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        add(label);
        setSize(getMaximumSize());
    }
}

public class Main {
    public static void main(String[] args) {
        new ImageLol().setVisible(true);
    }
}
