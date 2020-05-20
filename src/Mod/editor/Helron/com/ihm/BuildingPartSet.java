package Mod.editor.Helron.com.ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BuildingPartSet {
    private JTextField nameOfTheSetTextField;
    public JPanel nameOfTheParts;
    private JLabel setLabel;
    private JButton button;
    private static final int NB_FIELDS =1;


    public BuildingPartSet() {

        nameOfTheParts.setLayout(new BoxLayout(nameOfTheParts,BoxLayout.Y_AXIS));
        JButton button = new JButton("Add");
        JButton validate = new JButton("Validate");
        nameOfTheParts.add(button);
        nameOfTheParts.add(validate);

        final JPanel fieldpanel = new JPanel();
        nameOfTheParts.add(new JScrollPane((fieldpanel)));
        final GridBagLayout layout = new GridBagLayout();
        fieldpanel.setLayout(layout);
        button.addActionListener(new ActionListener() {

            int row=0;

            public void actionPerformed(ActionEvent e) {
                createFields(fieldpanel, layout, row++);
            }
        });

    }

    private static void createFields(JPanel fieldpanel, GridBagLayout layout, int row) {
        for(int i=0; i<NB_FIELDS; i++) {
            GridBagConstraints constraint=new GridBagConstraints();
            constraint.gridx=i;
            constraint.gridy=row;
            fieldpanel.add(new JTextField("",10),constraint);
        }
        fieldpanel.revalidate();
		/*//alternative exemple avec doLayout()
		fieldpanel.getParent().doLayout();
		fieldpanel.doLayout();*/
    }

    private void createUIComponents() {


                final JPanel panel=new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                JButton button = new JButton("ADD");
                panel.add(button);



                final JPanel fieldPanel=new JPanel();
                panel.add(new JScrollPane(fieldPanel));

                final GridBagLayout layout = new GridBagLayout();

                fieldPanel.setLayout(layout);


                button.addActionListener(new ActionListener() {

                    int row=0;

                    public void actionPerformed(ActionEvent e) {
                        createFields(fieldPanel, layout, row++);
                    }
                });


            }

        }


