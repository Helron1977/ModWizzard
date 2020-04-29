import javax.swing.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Test test= new Test();
        JFrame frame = new JFrame("Building Form");
        frame.setContentPane((new BuildingForm().BuildingForm));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JFrame project = new JFrame("Project Form");
        project.setContentPane((new ProjectForm().ProjectForm));
        project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        project.pack();
        project.setVisible(true);

        JFrame buildingPart = new JFrame("BuildingPart Form");
        buildingPart.setContentPane((new BuildingPartForm().BuildingPartForm));
        buildingPart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildingPart.pack();
        buildingPart.setVisible(true);

    }
}
