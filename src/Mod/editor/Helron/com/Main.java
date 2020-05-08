package Mod.editor.Helron.com;

import Mod.editor.Helron.com.IHM.ProjectForm;

import javax.swing.*;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IllegalAccessException, IOException, ClassNotFoundException, InstantiationException {


// launcg the first panel project form.
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, fall back to cross-platform
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
                // not worth my time
            }
        }

        JFrame project = new JFrame("Project Form");
        project.setContentPane((new ProjectForm(project).ProjectForm));
        project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        project.pack();
        project.setVisible(true);

    }

}
