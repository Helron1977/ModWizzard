package Mod.editor.Helron.com.api;

public enum DesirabilityEffectType {
    ADD,
    SUBSTRACT,
    MULTIPLY_POSITIVE,
    MULTIPLY_NEGATIVE,
    NULLIFY;

    public static String[] toStringList() {
        DesirabilityEffectType[] temp = DesirabilityEffectType.values();
        String[] enumValues = new String[temp.length];
        for(int i=0; i<temp.length; i++) {
            enumValues[i] = temp[i].toString();
        }

        return enumValues ;
    }
}
