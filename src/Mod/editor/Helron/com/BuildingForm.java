package Mod.editor.Helron.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingForm {
    JPanel BuildingForm;
    private JButton nextButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;

    public BuildingForm(String modName) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Building BuildingUnderCons = new Building("BUILDING","1","BUILDING_NAME","BUILDING_DESC",0, comboBox1.getSelectedItem().toString(),"","5","DESIRABILITY",true,true,true,false,true );
                try {
                    CodeBuilder.createBuildingCode(modName,BuildingUnderCons);
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
                JFrame buildingPart = new JFrame("BuildingPart Form");
                buildingPart.setContentPane((new BuildingPartForm(modName).BuildingPartForm));
                buildingPart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                buildingPart.pack();
                buildingPart.setVisible(true);
            }
        });
    }


}
