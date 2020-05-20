package Mod.editor.Helron.com.api;


import Mod.editor.Helron.com.ihm.ProjectForm;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Main {

    //-definir toute les classes -- fait
    //2-fabriquer une methode toString dans chacune
    //2-01- create a test .. fait
    //2-02- code a method toStringList working for an enum to attach them to a comboBox
    //3-03-
    //3-stocker les parametres de chaque class d'une part et leur valeur dans une list
    //4-stocker chaque list dans une list de list
    //5-faire un algo génrique qui convertie une list de list en script


    public static void main(String[] args) throws IllegalAccessException, IOException {


        // General setting nimbus look and feel.
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

/**
 * Launch the first panel
 */
        ProjectForm home = new ProjectForm();
        Frame frame = new Frame(home.projectForm);






        //new building
        ArrayList buildingParList = new ArrayList();
        buildingParList.add("part01");
        buildingParList.add("part02");

        VillagerStatusQuantityPair couple01 = new VillagerStatusQuantityPair("CITIZEN",3);
        VillagerStatusQuantityPair couple02 = new VillagerStatusQuantityPair("COMMONER",2);
        ArrayList villagerStatus = new ArrayList();
        villagerStatus.add(couple01);
        villagerStatus.add(couple02);

        BuildingPartSet parts = new BuildingPartSet("Set1", buildingParList);

        Building buildingToCode = new Building("01","02","name01","desc01","3","buildingType",parts,"GENERAL",villagerStatus);

       generateCode(buildingToCode);


    }

    public static void generateCode(Building buildingToCode) throws IllegalAccessException {
        //Store the class of the asset
        Class test = buildingToCode.getClass();

        //Store the param of the asset in a Field[]
        Field[] params = test.getDeclaredFields();

        //Collection of asset's params , objects
        LinkedHashMap<String,Object> structure = new LinkedHashMap<String, Object>(){
            @Override
            public String toString() {
                //change [ to {
                String step01 =super.toString().replace("[","{");
                //change ] to }
                String step02= step01.replace("]","}");
                // add /n at the end of each "String",
                String step04= step02.replace("\",","\",\n");
                // add /n at the end of each list
                String step05= step04.replace("},","},\n");
                // add /n between 2 {{ case begin a list of list
                String step06 = step05.replace("{{","{\n\t{");
                // add /n between 2 } case end list of list
                String step07= step06.replace("}},","}\n},");


                return step07.toString();
            }
        } ;

        for (Field param : params) {
            if (param.getType().toString().contains("String")) {
                structure.put(param.getName(), "\"" + param.get(buildingToCode) + "\"");
            } else {
                structure.put(param.getName(), param.get(buildingToCode));
            }

        }


        //Display the Lua code
            System.out.println(structure.toString());
        //export file
        File myFile = new File("C:\\Users\\Roland\\Desktop\\tmp/building.lua");

        try {

            // open an output stream that create the file
            Writer writer = new FileWriter(myFile);

            writer.write(structure.toString());

            writer.close();
        } catch (IOException e) {

            // affichage du message d'erreur et de la pile d'appel
            System.out.println("Erreur " + e.getMessage()) ;
            e.printStackTrace() ;
        }
    }
}
