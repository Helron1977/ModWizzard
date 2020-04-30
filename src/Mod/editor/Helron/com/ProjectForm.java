package Mod.editor.Helron.com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectForm {
    public JPanel ProjectForm;
    private JTextField ProjectField;
    private JTextField FbxNameField;
    private JButton nextButton;

    public ProjectForm() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Project modUnderCons = new Project(ProjectField.getText(),FbxNameField.getText());
                modUnderCons.createCode();
                JFrame frame = new JFrame("Building Form");
                frame.setContentPane((new BuildingForm(modUnderCons.modName).BuildingForm));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
