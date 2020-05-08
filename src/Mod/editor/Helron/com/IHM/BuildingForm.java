package Mod.editor.Helron.com.IHM;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingForm {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField name;
    private JLabel desc;
    private JTextField orderId;
    private JLabel nameLabel;
    private JTextField description;
    private JLabel descLabel;
    private JLabel orderIdLabel;
    private JLabel buildingPartSetListLabel;
    private JList BuildingPartSetList;
    private JComboBox BuildingTypeComboBox;
    private JLabel BuildingModelLabel;
    private JTextField buildingModel;
    private JList VillagerRequiredList;
    private JButton button1;
    private JLabel desirabilityLabel;
    private JComboBox desirabilityComboBox;
    private JCheckBox isManuallyUnlockedBox;
    private JCheckBox isDestructibleBox;
    private JCheckBox isEditableBox;
    private JCheckBox isHiddenBox;
    private JCheckBox isClearTreesBox;
    private JButton BuildingPartSetAddButton;
    private JLabel buildingTypeLabel;
    public JPanel buildingform;
    private JLabel buildingType;
    private JComboBox comboBox1;


    public BuildingForm(JFrame activeFrame) {
        BuildingPartSetAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
