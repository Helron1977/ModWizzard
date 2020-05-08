package Mod.editor.Helron.com.Serialization.lua;

import Mod.editor.Helron.com.API.Building;

import java.lang.reflect.Field;

public class CodeBuilder extends Syntax {


    public static void createBuildingCode(String modName) throws IllegalAccessException {

        /* Param of a class  Building store in a Field
         */
        Field[] params = Building.class.getDeclaredFields();


        //Genrate the Mod.lua file script in console
        System.out.println(register(modName));
        for(int i=0; i<params.length;i++)
        {
            if(!params[i].getName().contains("List"))
            {
                String code =params[i].getName()+equal()+doubleQuotationMark(params[i].get(new Building()).toString())+endOfLine();
                System.out.print(code);
            }
            else
            {
                String code =params[i].getName()+equal()+params[i].get(new Building()).toString()+endOfLine();
                System.out.print(code);
            }

        }
    }

    //Scan a  attributesTable to known if a param is a String or a List. return the name of the param.
    //

    //

/*    // Find a class name as the string arg, store class variables in a Field[]
    // create the code lua code of a list
    public static void addListCodeToString(String ParamToFill, Object toFill, Object toFillWith) throws IllegalAccessException {
        Class classNameToFill= toFill.getClass();
        Field[] params = classNameToFill.getDeclaredFields();

        for(int i=0; i<params.length;i++)
        {
            if(params[i].getName()==ParamToFill)
            {
                Class classNameToFillWith = toFillWith.getClass();
                Field[] paramsToUse = classNameToFillWith.getDeclaredFields();
                for(int j=0; i<paramsToUse.length;i++)
                {
                    String code=params[i].getName()+equal()+doubleQuotationMark(params[i].get(ToScan).toString());
                    System.out.println(code);
                }

            }

        }

    }*/

}
