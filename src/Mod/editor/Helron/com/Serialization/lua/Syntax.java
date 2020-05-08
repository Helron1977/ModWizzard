package Mod.editor.Helron.com.Serialization.lua;

public class Syntax {
    public static String register(String modName){
        return modName+":register({";
    }
    public static String doubleQuotationMark(String strToQuote){

        return "\""+strToQuote+"\"";
    }
    public static String endOfLine(){
        return ",\n";
    }
    public static String equal(){
        return " = ";
    }
    public static String hook(String strToHook) { return "{ "+strToHook+"}";}

}
