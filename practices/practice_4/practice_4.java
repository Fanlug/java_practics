
import java.awt.*;
import javax.swing.*;

class TextAreaExample extends JFrame {
    JTextArea jta1 = new JTextArea(10, 25);
    JButton buttonACMilan = new JButton("AC Milan");
    JButton buttonRealMadrid = new JButton("Real Madrid");
    JLabel jLabelResult = new JLabel("Result: 0 X 0");
    JLabel jLabelLastScorer = new JLabel("Last Scorer: N/A");
    JLabel jLabelWinner = new JLabel("Winner: DRAW");
    int scoreMadrid = 0;
    int scoreMilan = 0;

    public TextAreaExample() {
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(buttonACMilan);
        add(buttonRealMadrid);
        add(jLabelResult);
        add(jLabelLastScorer);
        add(jLabelWinner);
        buttonACMilan.addActionListener(ae -> {
            scoreMilan++;
            jLabelResult.setText("Result: " + scoreMilan + " X " + scoreMadrid);
            jLabelLastScorer.setText("Last Scorer: AC MILAN");
            if (scoreMadrid == scoreMilan) {
                jLabelWinner.setText("Winner: DRAW");
            } else if (scoreMadrid > scoreMilan) {
                jLabelWinner.setText("Winner: Real Madrid");
            } else {
                jLabelWinner.setText("Winner: AC Milan");
            }
        });
        buttonRealMadrid.addActionListener(ae -> {
            scoreMadrid++;
            jLabelResult.setText("Result: " + scoreMilan + " X " + scoreMadrid);
            jLabelLastScorer.setText("Last Scorer: Real Madrid");
            if (scoreMadrid == scoreMilan) {
                jLabelWinner.setText("Winner: DRAW");
            } else if (scoreMadrid > scoreMilan) {
                jLabelWinner.setText("Winner: Real Madrid");
            } else {
                jLabelWinner.setText("Winner: AC Milan");
            }
        });
    }
}

public class TestBall {
    public static void main(String[] args) {
        new TextAreaExample().setVisible(true);
    }
}

