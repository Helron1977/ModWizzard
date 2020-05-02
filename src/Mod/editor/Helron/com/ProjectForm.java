package Mod.editor.Helron.com;
import java.awt.*;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.*;
import javax.swing.text.html.HTML;
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
                frame.setContentPane((new BuildingForm(modUnderCons.modName).BuildingForm));
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
        String data = "<div class=\"li\"><a href=\"https://www.polymorph.games/foundation/modding/start#welcome_to_the_foundation_modding_wiki\">Welcome to the Foundation Modding Wiki</a></div>\n" +
                "<ul class=\"toc\">\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#more_info_on\">More info on:</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#where_do_i_start\">Where do I start?</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#the_modjson_file\">The mod.json file</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#the_modlua_script\">The mod.lua script</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#including_other_lua_files\">Including other LUA files</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#enablingdisabling_a_mod\">Enabling / Disabling a mod</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#loggingdebugging\">Logging / Debugging</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#what_is_this_generated_idslua_file\">What is this generated_ids.lua file?</a></div></li>\n" +
                "<li class=\"level2\"><div class=\"li\"><a href=\"#sharing_a_mod\">Sharing a mod</a></div></li>\n" +
                "</ul></li>";
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
