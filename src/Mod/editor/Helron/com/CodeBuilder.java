package Mod.editor.Helron.com;

import java.lang.reflect.Field;

public class CodeBuilder extends Syntax {


    public static void createBuildingCode(String modName, Building testBuilding) throws IllegalAccessException {
        Field[] params = Building.class.getDeclaredFields();
        System.out.println(register(modName));
        for(int i=0; i<params.length;i++)
        {
            String code =params[i].getName()+equal()+doubleQuotationMark(params[i].get(testBuilding).toString())+endOfLine();
            System.out.print(code);
        }
    }

/*    public static String createBuildingPartCode(BuildingPart buildingPartToCode){
        Field[] params = BuildingPart.class.getDeclaredFields();
        System.out.println(register());
        for(int i=0; i<params.length;i++)
        {
            String code =params[i].getName()+equal()+doubleQuotationMark(params[i].get(buildingPartToCode).toString())+endOfLine();
            System.out.print(code);
        }
        return "//End of code"; // just to have a return..;
    }*/


}
