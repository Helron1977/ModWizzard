package Mod.editor.Helron.com.IHM;


import Mod.editor.Helron.com.API.Desirability;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class BuildingPartForm {
    private JTextField name;
    private JLabel nameLabel;
    private JTextField description;
    private JLabel descriptionLabel;
    private JTextField category;
    private JLabel categoryLabel;
    private JCheckBox hasMaximumInstancePerBuildingCheckBox;
    private JSpinner MaximumInstancePerBuildingSpinner;
    private JComboBox moverComboBox;
    private JLabel moverLabel;
    private JComboBox buildingConstructorComboBox;
    private JCheckBox isPreviewGroundVisibleCheckBox;
    private JTextField constructionVisual;
    private JLabel constructionVisualLabel;
    private JList list1;
    private JButton estateSplendorAddButton;
    private JLabel costLabel;
    private JLabel estateSplendorLabel;
    private JList list2;
    private JButton costButton;
    private JLabel capacityLabel;
    private JSpinner capacitySpinner;
    private JLabel desirabilityModifiers;
    private JList list3;
    private JButton desirabilityModifiersButton;
    private JButton nextButton;

    public BuildingPartForm() {
        desirabilityModifiersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get all Desirability
                Desirability[] temp = Desirability.values();

                //create a string array of the same lenght as the array
                String[] str = new String[temp.length];

                //append all the Desirability value to the string array
                for ( int i =0; i < temp.length; i++){
                    str[i]= temp[i].toString();
                }

                //pass it to the comboBox
                Frame test = new Frame();

                JComboBox<Desirability> desirabilityJComboBox = new JComboBox<Desirability>(Desirability.values());





            }
        });
    }
}
