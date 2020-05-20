package Mod.editor.Helron.com.ihm;


import Mod.editor.Helron.com.api.BuildingPartMover;
import Mod.editor.Helron.com.api.BuildingType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingPartForm extends Container {
    public JPanel buildingPartListform;
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
    private JButton estateSplendorAddButton;
    private JLabel costLabel;
    private JLabel estateSplendorLabel;
    private JList list2;
    private JButton costButton;
    private JLabel capacityLabel;
    private JSpinner capacitySpinner;
    private JLabel desirabilityModifiers;
    private JButton desirabilityModifiersButton;
    private JButton nextButton;
    private JPanel splendorSubForm;
    private JPanel desirabilityPanel;


    public BuildingPartForm() {

        //Attach Enum values to comboBoxes
        BuildingPartMover[] temp1 = BuildingPartMover.values();

        //create a string array of the same lenght as the array
        String[] movers = new String[temp1.length];

        //append all the Desirability value to the string array
        for ( int i =0; i < temp1.length; i++){
            movers[i]= temp1[i].toString();
            moverComboBox.addItem(movers[i]);
        }
        BuildingType[] temp2 = BuildingType.values();

        //create a string array of the same lenght as the array
        String[] constructors = new String[temp1.length];

        //append all the Desirability value to the string array
        for ( int i =0; i < temp1.length; i++){
            constructors[i]= temp1[i].toString();
            buildingConstructorComboBox.addItem(constructors[i]);
        }




        desirabilityModifiersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                /*DesirabilityModifiersForm desirabilityModifiersForm= new DesirabilityModifiersForm();
                JFrame desirabilityFrame = new JFrame("Desirability  Modifiers Forms");
                desirabilityFrame.setContentPane(desirabilityModifiersForm.desirabilityModifiersForm);
                desirabilityFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                desirabilityFrame.pack();
                desirabilityFrame.setVisible(true);*/

                //get the different values from the TestFields





                //intancialise a new Building





            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        ;
        this.splendorSubForm = new DesirabilityModifiersForm().desirabilityModifiersForm;


    }
}
