package Mod.editor.Helron.com;

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

}
