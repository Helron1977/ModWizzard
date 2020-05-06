package Mod.editor.Helron.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingForm {
    JPanel BuildingForm;
    private JButton nextButton;
    private JTextField buildingName;
    private JTextField description;
    private JComboBox comboBox1;

    public BuildingForm(String modName) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    actionToDo(modName);
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

    private void actionToDo(String modName) throws IllegalAccessException {
        linkFieldtoParams(modName);
        CodeBuilder.createBuildingCode(modName);

    }

    private void linkFieldtoParams(String modName) {

        Building.setId(modName+"_01");
        Building.setBuildingPartSetList(
                "\n "+Syntax.hook(
                        Syntax.hook(
                                "\n\tName"+Syntax.equal()+Syntax.doubleQuotationMark(modName.toUpperCase()+"_NAME")+Syntax.endOfLine()
                                +"\tBuildingPartList"+Syntax.equal()+Syntax.hook(Syntax.doubleQuotationMark(modName.toUpperCase()+"_PART"))+"\n"
                        )

                )

        );


    }


}
