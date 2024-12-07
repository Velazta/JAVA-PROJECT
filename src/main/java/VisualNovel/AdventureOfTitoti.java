package VisualNovel;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;

public class AdventureOfTitoti {
    JFrame window;
    Container con;

    JPanel TittleNamePanel, starButtonPanel;
    JLabel TittleNameLabel;
    Font tittleFont = new Font("Times New Roman", Font.BOLD, 50);
    public static void main(String[] args) {
        new AdventureOfTitoti();
    }

    public AdventureOfTitoti() {
        window = new JFrame("Adventure of Titoti", null);
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        TittleNamePanel = new JPanel();
        TittleNamePanel.setBounds(100, 100, 600, 150);
        TittleNamePanel.setBackground(Color.BLACK);
        TittleNameLabel = new JLabel("ADVENTURE OF TITO");
        TittleNameLabel.setForeground(Color.white);
        TittleNameLabel.setFont(tittleFont);

        starButtonPanel = new JPanel();
        starButtonPanel.setBounds(300, 400, 200, 100);
        starButtonPanel.setBackground(Color.white);

        TittleNamePanel.add(TittleNameLabel);
        con.add(TittleNamePanel);
        con.add(starButtonPanel);
    }
//testing commant to code together
}
