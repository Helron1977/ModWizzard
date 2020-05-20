package Mod.editor.Helron.com.api;

public enum BuildingFunction {
    BUILDING_FUNCTION_BRIDGE,
    BUILDING_FUNCTION_INN,
    BUILDING_FUNCTION_VILLAGE_CENTER,
    BUILDING_FUNCTION_PUBLIC_LOUNGE,
    BUILDING_FUNCTION_RESOURCE_GENERATOR,
    BUILDING_FUNCTION_GREAT_HALL,
    BUILDING_FUNCTION_MONASTERY,
    BUILDING_FUNCTION_ASSIGNABLE,
    BUILDING_FUNCTION_CHURCH_BELL,
    BUILDING_FUNCTION_HOUSE,
    BUILDING_FUNCTION_PUBLIC_LOUNGE_ROOM,
    BUILDING_FUNCTION_WORKPLACE,
    BUILDING_FUNCTION_LORD_MANOR;

    public static String[] toStringList() {
        BuildingFunction[] temp = BuildingFunction.values();
        String[] enumValues = new String[temp.length];
        for(int i=0; i<temp.length; i++) {
            enumValues[i] = temp[i].toString();
        }

        return enumValues ;
    }
}
