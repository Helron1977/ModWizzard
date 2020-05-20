package Mod.editor.Helron.com.api;

public enum  DesirabilityLayer {
    DESIRABILITY_FERTILITY,
    DESIRABILITY_IRON_ORE,
    DESIRABILITY_RESIDENTIAL;

    public static String[] toStringList() {
        Desirability[] temp = Desirability.values();
        String[] enumValues = new String[temp.length];
        for(int i=0; i<temp.length; i++) {
            enumValues[i] = temp[i].toString();
        }

        return enumValues ;
    }

}
