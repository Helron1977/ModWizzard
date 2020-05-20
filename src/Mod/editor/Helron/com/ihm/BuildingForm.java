package Mod.editor.Helron.com.ihm;


import Mod.editor.Helron.com.api.*;
import Mod.editor.Helron.com.api.BuildingPartSet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;


public class BuildingForm extends Main {

    SubPanelBuildingPart subpanelBuildingpart;
    SubPanelVillagerRequired subPanelVillagerRequired;


    public JPanel buildingform;
    public JLabel nameLabel;
    public JTextField name;
    public JLabel descLabel;
    public JTextField description;
    public JLabel orderIdLabel;
    public JTextField orderId;
    public JLabel buildingPartSetListLabel;
    public JComboBox buildingTypeComboBox;
    public JLabel BuildingModelLabel;
    public JTextField buildingModel;
    public JLabel desirabilityLabel;
    public JComboBox desirabilityComboBox;
    public JCheckBox isManuallyUnlockedBox;
    public JCheckBox isDestructibleBox;
    public JCheckBox isEditableBox;
    public JCheckBox isHiddenBox;
    public JCheckBox isClearTreesBox;
    public JLabel buildingTypeLabel;
    public JLabel villagerRequiredLabel;
    public JButton nextButton;
    private JPanel villagerRequiredPanel;
    private JPanel buildingpartListPanel;
    static JTextField subFormTextField;
    private JPanel fieldPanel;
    public JLabel buildingType;
    public JComboBox comboBox1;


    public BuildingForm() {

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    generateBuildingCode();
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }

    private void generateBuildingCode() throws IllegalAccessException {
        //get the main Form Data
            String dataType = "Building";
            String id = "BuildingId";
            String name = getName().getText();
            String description = getDescription().getText();
            String orderId = getOrderId().getText();
            String buildingType = Objects.requireNonNull(getBuildingTypeComboBox().getSelectedItem()).toString();
            String buildingModel = getBuildingModel().getText();
            ArrayList<VillagerStatusQuantityPair> villagerRequired;
            String desirabilityLayer = Objects.requireNonNull(getDesirabilityComboBox().getSelectedItem()).toString();
            boolean isManuallyUnlocked = getIsManuallyUnlockedBox().isSelected();
            boolean isDestructible = getIsDestructibleBox().isSelected();
            boolean isEditable = getIsEditableBox().isSelected();
            boolean isHidden = getIsHiddenBox().isSelected();
            boolean isClearTrees = getIsClearTreesBox().isSelected();


        //get the Subforms Datas

        //Create a ArrayList . only one set of BuildingPArt at the moment
        ArrayList<String> buildingParList = new ArrayList<String>();
        buildingParList = subpanelBuildingpart.getJComponentToStringList();
        Mod.editor.Helron.com.api.BuildingPartSet buildingPartSet = new BuildingPartSet("SET1", buildingParList);

        //Create an ArrayList to get the datas of villager Subform
        ArrayList<String> tmp = subPanelVillagerRequired.getJComponentToStringList();
        ArrayList villagerStatus = new ArrayList();

        for(int i = 0; i< tmp.size(); i=i+2){
             //couple.clear();
            ArrayList couple = new ArrayList<VillagerStatusQuantityPair>();
             couple.add(tmp.get(i));
             couple.add(tmp.get(i+1));
             villagerStatus.add(couple);
        }




            //intancialise a new Building


        Building BuildingToCode = new Building(dataType,id,name,description,orderId,buildingType,
                buildingPartSet,buildingModel,villagerStatus);
                //,desirabilityLayer,
                //isManuallyUnlocked,isDestructible,isEditable,isHidden);
        ;
        generateCode(BuildingToCode);



    }




    private void createUIComponents() {
        // TODO: place custom component creation code here

        MyEnumComboBox buildingTypeCbx = new MyEnumComboBox(BuildingType.toStringList());
        buildingTypeComboBox = buildingTypeCbx.getCbx();

        MyEnumComboBox desirabilityCbx = new MyEnumComboBox(Desirability.toStringList());
        desirabilityComboBox = desirabilityCbx.getCbx();

        //Jpanel BuildingPartsListPanel with one + button that add new JtextField on clic
        subpanelBuildingpart = new SubPanelBuildingPart();
        buildingpartListPanel= subpanelBuildingpart.getCustomPanel();


        //Jpanel VillagerRequired with 2 raw of JcomboBox add a new line on clic
        subPanelVillagerRequired = new SubPanelVillagerRequired();
        villagerRequiredPanel = subPanelVillagerRequired.getCustomPanel();


    }


    public JTextField getName() {
        return name;
    }

    public JTextField getDescription() {
        return description;
    }

    public JTextField getOrderId() {
        return orderId;
    }


    public JComboBox getBuildingTypeComboBox() {
        return buildingTypeComboBox;
    }

    public JTextField getBuildingModel() {
        return buildingModel;
    }


    public JComboBox getDesirabilityComboBox() {
        return desirabilityComboBox;
    }

    public JCheckBox getIsManuallyUnlockedBox() {
        return isManuallyUnlockedBox;
    }

    public JCheckBox getIsDestructibleBox() {
        return isDestructibleBox;
    }

    public JCheckBox getIsEditableBox() {
        return isEditableBox;
    }

    public JCheckBox getIsHiddenBox() {
        return isHiddenBox;
    }

    public JCheckBox getIsClearTreesBox() {
        return isClearTreesBox;
    }
}
