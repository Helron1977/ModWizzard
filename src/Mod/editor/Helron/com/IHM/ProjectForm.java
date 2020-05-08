package Mod.editor.Helron.com.IHM;
import Mod.editor.Helron.com.API.Project;

import java.awt.*;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ProjectForm {
    public JPanel ProjectForm;
    private JTextField FbxNameField;
    private JTextPane welcome;
    private JEditorPane summary;
    private JTextField ProjectField;
    private JButton next;
    private JLabel projectNameLabel;
    private JLabel FbxLabel;


    public ProjectForm(JFrame activeFrame) throws IOException {
       next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Project modUnderCons = new Project(ProjectField.getText(),FbxNameField.getText());
                modUnderCons.createCode();
                JFrame frame = new JFrame("Building Form");
                frame.setContentPane((new BuildingForm(frame)).buildingform);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                activeFrame.dispose();

            }
        });
       welcome.setOpaque(false);
        welcome.setText("Welcome to your Foundation Mod Wizzard.\n Let's start and chose a name for your mod and give the name of your fbx file.\n \n Then click next !");
        summary.setContentType("text/html");
        summary.setEditable(false);
        summary.setOpaque(false);
        String data = "<ul><a href=\"/foundation/modding/start\"<img src=\"https://www.polymorph.games/foundation/modding/lib/tpl/dokuwiki/images/logo.png\"</ul> <li>Foundation - Modding Documentation</li>";
        summary.setText(data);
        HyperlinkListener listener = new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent hyperLink) {

                if (HyperlinkEvent.EventType.ACTIVATED.
                        equals(hyperLink.getEventType())) {
                    try {
                        //respond to html link clicked
                        //JOptionPane.showMessageDialog(null, "HTML has been clicked !!" );
                        String monLien = "https://www.polymorph.games/foundation/modding/start#welcome_to_the_foundation_modding_wiki";
                        try
                        {
                            Desktop.getDesktop().browse(new URL(monLien).toURI());
                        }
                        catch(URISyntaxException | IOException e){}
                    }
                    catch (Exception ex) { ex.printStackTrace();}


                }
            }

        };
        summary.addHyperlinkListener(listener);




    }

}
