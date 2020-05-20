package Mod.editor.Helron.com.api;


import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(JPanel panelToDisplay){
        //get screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        //set frame size 1/2 screenSize;
        this.setSize(width/2-panelToDisplay.getWidth(),height/2-panelToDisplay.getHeight());
        this.setContentPane(panelToDisplay);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }
}
