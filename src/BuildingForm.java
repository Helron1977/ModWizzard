import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingForm {
    JPanel BuildingForm;
    private JButton nextButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;

    public BuildingForm() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello Helron");
            }
        });
    }


}
