package Game;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.io.IOException;

public class Main {

    public static JPanel panMain;
    public static JFrame frame = new JFrame();

    public static void main(String[] args) throws IOException {

        JPanel panDeath = new JPanel();    
        JLabel lbldeath = new JLabel();
        panMain = new JPanel(new CardLayout());
        panDeath.add(lbldeath);
        JPanel panGame = new JPanel(new BorderLayout());
        panGame.add(new PanBoard(), BorderLayout.CENTER);
        panGame.add(new Healthbar(), BorderLayout.NORTH);
        panMain.add(panGame, "2");
        panMain.add(panDeath, "3");
        frame.setLayout(new BorderLayout());
        frame.add(panMain);
        frame.setTitle("Daniel's GAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 636);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        lbldeath.setText("you died");
        panDeath.setBackground(Color.red);
        lbldeath.setFont((lbldeath.getFont().deriveFont(Font.BOLD, 155.0f)));
    }
}