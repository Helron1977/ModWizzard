package Mod.editor.Helron.com.IHM;

import Mod.editor.Helron.com.API.Desirability;

import javax.swing.*;

public class DesirabilityModifiersForm {
    private JComboBox desirabilitycomboBox;
    private JComboBox typeComboBox;
    private JLabel desirabilityLabel;
    private JLabel typeLabel;


    public DesirabilityModifiersForm() {

        desirabilitycomboBox.addItem(Desirability.DESIRABILITY_FERTILITY.toString());
        desirabilitycomboBox.addItem(Desirability.DESIRABILITY_IRON_ORE.toString());
        desirabilitycomboBox.addItem(Desirability.DESIRABILITY_RESIDENTIAL.toString());
    }

}
