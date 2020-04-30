package Mod.editor.Helron.com;

import java.lang.reflect.Field;

public class CodeBuilder extends Syntax {


    public static String createBuildingCode(Building testBuilding) throws IllegalAccessException {
        Field[] params = Building.class.getDeclaredFields();
        System.out.println(register());
        for(int i=0; i<6;i++)
        {
            String code =params[i].getName()+equal()+doubleQuotationMark(params[i].get(testBuilding).toString())+endOfLine();
            System.out.print(code);
        }
        return "//End of code"; // just to have a return..;
    }

    public static String createBuildingPartCode(BuildingPart buildingPartToCode) throws IllegalAccessException {
        Field[] params = BuildingPart.class.getDeclaredFields();
        System.out.println(register());
        for(int i=0; i<params.length;i++)
        {
            String code =params[i].getName()+equal()+doubleQuotationMark(params[i].get(buildingPartToCode).toString())+endOfLine();
            System.out.print(code);
        }
        return "//End of code"; // just to have a return..;
    }


}
