package GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class CobaFormAbsoluteLayout extends JFrame{
    private static final int FRAME_WIDTH     = 400;
    private static final int FRAME_HEIGHT    = 300;
    private static final int FRAME_X_ORIGRIN = 150;
    private static final int FRAMAE_Y_ORIGIN = 250;
    private static final int MARGIN_TOP = 25;
    private static final int MARGIN_LEFT = 20;
    private static final int WIDTH_DEF = 100;
    private static final int HEIGHT_DEF = 30;
    
    private JButton cancelButton;
    private JButton okButton;
    public static void main(String[] args) {
        CobaFormAbsoluteLayout frame = new CobaFormAbsoluteLayout();
        frame.setVisible(true);
    }

    public CobaFormAbsoluteLayout() {
        Container contentPane = getContentPane();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Input Data");
        setLocation(FRAME_X_ORIGRIN, FRAMAE_Y_ORIGIN);
        
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        JLabel label_1 = new JLabel("Nama: ");
        label_1.setBounds(MARGIN_LEFT,MARGIN_TOP,WIDTH_DEF,HEIGHT_DEF);
        contentPane.add(label_1);
        
        JTextField textField = new JTextField();
        textField.setBounds(MARGIN_LEFT+WIDTH_DEF, MARGIN_TOP, FRAME_WIDTH-150, HEIGHT_DEF);
        contentPane.add(textField);
        
        JLabel label_2 = new JLabel("Jenis Kelamin:");
        label_2.setBounds(MARGIN_LEFT,MARGIN_TOP+HEIGHT_DEF,WIDTH_DEF,HEIGHT_DEF);
        contentPane.add(label_2);
        
        JRadioButton radioButton_1 = new JRadioButton("Laki-laki");
        radioButton_1.setBounds(MARGIN_LEFT+WIDTH_DEF, MARGIN_TOP+HEIGHT_DEF, WIDTH_DEF, HEIGHT_DEF);
        radioButton_1.setBackground(Color.WHITE);
        contentPane.add(radioButton_1);
        
        JRadioButton radioButton_2 = new JRadioButton("Perempuan");
        radioButton_2.setBounds(MARGIN_LEFT+(2*WIDTH_DEF), MARGIN_TOP+HEIGHT_DEF, WIDTH_DEF, HEIGHT_DEF);
        radioButton_2.setBackground(Color.WHITE);
        contentPane.add(radioButton_2);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton_1);
        buttonGroup.add(radioButton_2);
        
        JLabel label_3 = new JLabel("Hobi:");
        label_3.setBounds(MARGIN_LEFT,MARGIN_TOP+(2*HEIGHT_DEF),WIDTH_DEF,HEIGHT_DEF);
        contentPane.add(label_3);
        
        JCheckBox checkBox_1 = new JCheckBox("Olahraga");
        checkBox_1.setBounds(MARGIN_LEFT+WIDTH_DEF, MARGIN_TOP+(2*HEIGHT_DEF),WIDTH_DEF+20, HEIGHT_DEF);
        checkBox_1.setBackground(Color.WHITE);
        contentPane.add(checkBox_1);
        
        JCheckBox checkBox_2 = new JCheckBox("Shopping");
        checkBox_2.setBounds(MARGIN_LEFT+WIDTH_DEF, MARGIN_TOP+(3*HEIGHT_DEF),WIDTH_DEF+20, HEIGHT_DEF);
        checkBox_2.setBackground(Color.WHITE);
        contentPane.add(checkBox_2);
        
        JCheckBox checkBox_3 = new JCheckBox("Computer Games");
        checkBox_3.setBounds(MARGIN_LEFT+WIDTH_DEF, MARGIN_TOP+(4*HEIGHT_DEF),2*WIDTH_DEF, HEIGHT_DEF);
        checkBox_3.setBackground(Color.WHITE);
        contentPane.add(checkBox_3);
        
        JCheckBox checkBox_4 = new JCheckBox("Nonton Bioskop");
        checkBox_4.setBounds(MARGIN_LEFT+WIDTH_DEF, MARGIN_TOP+(5*HEIGHT_DEF),2*WIDTH_DEF, HEIGHT_DEF);
        checkBox_4.setBackground(Color.WHITE);
        contentPane.add(checkBox_4);
        
        okButton = new JButton("OK");
        okButton.setBounds(MARGIN_LEFT+WIDTH_DEF, MARGIN_TOP+(6*HEIGHT_DEF)+10,60, HEIGHT_DEF);
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(MARGIN_LEFT+(2*WIDTH_DEF), MARGIN_TOP+(6*HEIGHT_DEF)+10,WIDTH_DEF,HEIGHT_DEF);
        contentPane.add(cancelButton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
