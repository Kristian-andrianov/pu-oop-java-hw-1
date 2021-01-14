package Game;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        paintFirstLine(g);
        paintSecondLine(g);
        paintThirdLine(g);
        paintForthLine(g);
        paintFifthLine(g);
        paintFiguras(g);
    }

    public void paintFiguras(Graphics g) {
        printGreenFiguras(g);
        printYellowFiguras(g);
    }

    public void printGreenFiguras(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(25, 425, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(125, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(130, 430, 40, 40);
        g.setColor(Color.yellow);
        g.fillOval(225, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(230, 430, 40, 40);
        g.setColor(Color.yellow);
        g.fillOval(325, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(330, 430, 40, 40);
        g.setColor(Color.yellow);
        g.fillOval(425, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(430, 430, 40, 40);
    }

    public void printYellowFiguras(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(25, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(30, 30, 40, 40);
        g.setColor(Color.green);
        g.fillOval(125, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(130, 30, 40, 40);
        g.setColor(Color.green);
        g.fillOval(225, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(230, 30, 40, 40);
        g.setColor(Color.green);
        g.fillOval(325, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(330, 30, 40, 40);
        g.fillRect(425,25,50,50);
    }

    public void paintFifthLine(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 400, 100, 100);
        g.setColor(Color.red);
        g.fillRect(100, 400, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 400, 100, 100);
        g.setColor(Color.red);
        g.fillRect(300, 400, 100, 100);
        g.setColor(Color.black);
        g.fillRect(400, 400, 100, 100);
    }

    public void paintForthLine(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 300, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(100, 300, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 300, 100, 100);
        g.setColor(Color.gray);
        g.fillRect(300, 300, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(400, 300, 100, 100);

    }

    public void paintThirdLine(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 200, 100, 100);
        g.setColor(Color.white);
        g.fillRect(100, 200, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 200, 100, 100);
        g.setColor(Color.GRAY);
        g.fillOval(225, 225, 50, 50);
        g.setColor(Color.white);
        g.fillRect(300, 200, 100, 100);
        g.setColor(Color.white);
        g.fillRect(400, 200, 100, 100);
    }

    public void paintSecondLine(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 100, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 100, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(300, 100, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(400, 100, 100, 100);
    }

    public void paintFirstLine(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 100, 100);
        g.setColor(Color.black);
        g.fillRect(100, 0, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 0, 100, 100);
        g.setColor(Color.black);
        g.fillRect(300, 0, 100, 100);
        g.setColor(Color.RED);
        g.fillRect(400, 0, 100, 100);
    }

    public GameBoard() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}