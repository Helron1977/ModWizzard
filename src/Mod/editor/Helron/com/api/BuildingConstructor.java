package Mod.editor.Helron.com.api;

public enum BuildingConstructor {
    BUILDING_CONSTRUCTOR_RANDOM,
    BUILDING_CONSTRUCTOR_DEFAULT,
    BUILDING_CONSTRUCTOR_RANDOM_PART,
    BUILDING_CONSTRUCTOR_BRIDGE,
    BUILDING_CONSTRUCTOR_ASSEMBLAGE;
    boolean isPreviewGroundVisible;

    public static String[] toStringList() {
        BuildingConstructor[] temp = BuildingConstructor.values();
        String[] enumValues = new String[temp.length];
        for(int i=0; i<temp.length; i++) {
            enumValues[i] = temp[i].toString();
        }

        return enumValues ;
    }
}
