package Mod.editor.Helron.com.IHM;


import Mod.editor.Helron.com.API.Building;
import Mod.editor.Helron.com.API.BuildingPartSet;
import Mod.editor.Helron.com.API.VillagerStatusQuantityPair;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BuildingForm {
    public JPanel buildingform;



    public JLabel nameLabel;
    public JTextField name;
    public JLabel descLabel;
    public JTextField description;
    public JLabel orderIdLabel;
    public JTextField orderId;
    public JLabel buildingPartSetListLabel;
    public JList BuildingPartSetList;
    public JComboBox BuildingTypeComboBox;
    public JLabel BuildingModelLabel;
    public JTextField buildingModel;
    public JList VillagerRequiredList;
    public JButton button1;
    public JLabel desirabilityLabel;
    public JComboBox desirabilityComboBox;
    public JCheckBox isManuallyUnlockedBox;
    public JCheckBox isDestructibleBox;
    public JCheckBox isEditableBox;
    public JCheckBox isHiddenBox;
    public JCheckBox isClearTreesBox;
    public JButton BuildingPartSetAddButton;
    public JLabel buildingTypeLabel;
    public JLabel villagerRequiredLabel;
    public JButton nextButton;

    public JTextField getName() {
        return name;
    }

    public JTextField getDescription() {
        return description;
    }

    public JTextField getOrderId() {
        return orderId;
    }

    public JList getBuildingPartSetList() {
        return BuildingPartSetList;
    }

    public JComboBox getBuildingTypeComboBox() {
        return BuildingTypeComboBox;
    }

    public JTextField getBuildingModel() {
        return buildingModel;
    }

    public JList getVillagerRequiredList() {
        return VillagerRequiredList;
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

    public JLabel buildingType;
    public JComboBox comboBox1;


    public BuildingForm(JFrame activeFrame) {
        BuildingPartSetAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get the different values from the TestFields





                //intancialise a new Building



            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //get the different values from the TestFields
                String dataType = "Building";
                String id= "BuildingId";
                String name = getName().toString();
                String description =getDescription().toString();
                String orderId=getOrderId().toString();
                String buildingType= getBuildingTypeComboBox().getSelectedItem().toString();
                ArrayList<BuildingPartSet> buildingPartSetArrayList ;
                String buildingModel = getBuildingModel().toString();
                ArrayList<VillagerStatusQuantityPair> villagerRequired;
                String desirabilityLayer=getDesirabilityComboBox().getSelectedItem().toString();
                boolean isManuallyUnlocked=getIsManuallyUnlockedBox().isSelected();
                boolean isDestructible=getIsDestructibleBox().isSelected();
                boolean isEditable=getIsEditableBox().isSelected();
                boolean isHidden=getIsHiddenBox().isSelected();
                boolean isClearTrees=getIsClearTreesBox().isSelected();


                //intancialise a new Building
                Building BuildingToCode = new Building(dataType,id,name,description,orderId,buildingType,
                        buildingPartSetArrayList,buildingModel,villagerRequired,desirabilityLayer,
                        isManuallyUnlocked,isDestructible,isEditable,isHidden);
            }
        });
    }
}
