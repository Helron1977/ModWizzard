package Mod.editor.Helron.com.ihm;


import Mod.editor.Helron.com.api.Desirability;
import Mod.editor.Helron.com.api.DesirabilityEffectType;

import javax.swing.*;

public class DesirabilityModifiersForm {
    private JComboBox desirabilitycomboBox;
    private JComboBox typeComboBox;
    private JLabel desirabilityLabel;
    private JLabel typeLabel;
    public JPanel desirabilityModifiersForm;


    public DesirabilityModifiersForm() {

        Desirability[] temp1 = Desirability.values();

        //create a string array of the same lenght as the array
        String[] str = new String[temp1.length];

        //append all the Desirability value to the string array
        for ( int i =0; i < temp1.length; i++){
            str[i]= temp1[i].toString();
            desirabilitycomboBox.addItem(str[i]);
        }

        DesirabilityEffectType[] temp2 = DesirabilityEffectType.values();

        //create a string array

        String[] typeValue = new String[temp2.length];

        //append all the Desirability effect type value to the string array
        for ( int i =0; i < temp2.length; i++){
            typeValue[i]= temp2[i].toString();
            typeComboBox.addItem(typeValue[i]);
        }





    }

}
