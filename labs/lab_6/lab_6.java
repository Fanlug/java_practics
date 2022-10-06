import java.awt.*;
import javax.swing.*;

class ImageLol extends JFrame {
    JComboBox colorBox = new JComboBox(new String[]{"Синий", "Красный", "Чёрный"});
    JComboBox fontBox = new JComboBox(new String[]{"Times New Roman", "MS Sans Serif", "Courier New"});
    JTextArea textArea = new JTextArea("                      ");

    public ImageLol() {
        setLayout(new FlowLayout());
        add(colorBox);
        add(fontBox);
        textArea.setForeground(Color.BLUE);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        add(textArea);
        colorBox.addActionListener(e -> {
            if (colorBox.getSelectedItem().toString().equals("Синий")) {
                textArea.setForeground(Color.BLUE);
            } else if (colorBox.getSelectedItem().toString().equals("Красный")) {
                textArea.setForeground(Color.RED);
            } else {
                textArea.setForeground(Color.BLACK);
            }
        });
        fontBox.addActionListener(e -> {
            if (fontBox.getSelectedItem().toString().equals("Times New Roman")) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            } else if (fontBox.getSelectedItem().toString().equals("MS Sans Serif")) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16));
            } else {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 16));
            }
        });
        setSize(300,300);
    }
}

class Main {
    public static void main(String[] args) {
        new ImageLol().setVisible(true);
    }
}
