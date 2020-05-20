package Mod.editor.Helron.com.api;

public enum BuildingPartMover {
    BUILDING_PART_MOVER_INSTANCE,
    BUILDING_PART_MOVER_BRIDGE;
    boolean isInInteraction= false;

    public static String[] toStringList() {
        BuildingPartMover[] temp = BuildingPartMover.values();
        String[] enumValues = new String[temp.length];
        for(int i=0; i<temp.length; i++) {
            enumValues[i] = temp[i].toString();
        }

        return enumValues ;
    }
}
