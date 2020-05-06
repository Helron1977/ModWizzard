package Mod.editor.Helron.com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingPartForm {
    public JPanel BuildingPartForm;
    private JButton nextButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField categoryField;
    private JCheckBox checkBox1;
    private JSpinner spinner1;

    public BuildingPartForm(String modName) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuildingPart.setId(modName.toUpperCase()+"_PART");
                BuildingPart.setDescription(modName.toUpperCase()+"_DEC");
                BuildingPart.setCategory(categoryField.getText());


            }
        });
    }
}
