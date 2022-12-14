package GUI;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class CobaAbsolutePositioning extends JFrame{
    private static final int FRAME_WIDTH     = 300;
    private static final int FRAME_HEIGHT    = 220;
    private static final int FRAME_X_ORIGRIN = 150;
    private static final int FRAMAE_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    
    private JButton cancelButton;
    private JButton okButton;
    public static void main(String[] args) {
        CobaAbsolutePositioning frame = new CobaAbsolutePositioning();
        frame.setVisible(true);
    }

    public CobaAbsolutePositioning() {
        Container contentPane = getContentPane();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch14AbsolutePositioning");
        setLocation(FRAME_X_ORIGRIN, FRAMAE_Y_ORIGIN);
           
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);

        okButton = new JButton("OK");
        okButton.setBounds(20, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(180, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

