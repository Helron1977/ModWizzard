package Mod.editor.Helron.com.ihm;


import Mod.editor.Helron.com.api.Project;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class ProjectForm {
    public JPanel projectForm;
    private JTextField FbxNameField;
    private JTextPane welcome;
    private JEditorPane summary;
    private JTextField ProjectField;
    private JButton next;
    private JLabel projectNameLabel;
    private JLabel FbxLabel;
    public BuildingForm mainBuildingForm;


    public ProjectForm()  {
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(projectForm).dispose();
                Project modUnderCons = new Project(ProjectField.getText(),FbxNameField.getText());
                modUnderCons.createCode();
                BuildingForm mainBuildingForm = new BuildingForm();
                Frame frame1 = new Mod.editor.Helron.com.api.Frame(mainBuildingForm.buildingform);
            }
        });
        welcome.setOpaque(false);
        welcome.setText("Welcome to your Foundation Mod Wizzard.\n Let's start and chose a name for your mod and give the name of your fbx file.\n \n Then click next !");
        summary.setContentType("text/html");
        summary.setEditable(false);
        summary.setOpaque(false);
        String data = "<ul><a href=\"/foundation/modding/start\"<img src=\"https://www.polymorph.games/foundation/modding/lib/tpl/dokuwiki/images/logo.png\"</ul> <li>Foundation - Modding Documentation</li>";
        summary.setText(data);

        summary.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (HyperlinkEvent.EventType.ACTIVATED.
                        equals(e.getEventType())) {
                    try {
                        //respond to html link clicked
                        //JOptionPane.showMessageDialog(null, "HTML has been clicked !!" );
                        String monLien = "https://www.polymorph.games/foundation/modding/start#welcome_to_the_foundation_modding_wiki";

                            Desktop.getDesktop().browse(new URL(monLien).toURI());

                    }
                    catch (Exception ex) { ex.printStackTrace();}


                }
            }
        });
    }

}
