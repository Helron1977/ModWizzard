package Mod.editor.Helron.com;

import java.util.ArrayList;

public class Building {

    String dataType = "BUILDING";
    String id = "GALLOWS_01";
    String name = "string";
    String description = "string";
    int orderId = 0; //Optional
    String buildingType; //default: GENERAL
    ArrayList<BuildingPartSet> buildingPartSetArrayList;
    String buildingModel = "" ;//name of a previous declared PREFAB (default: nil)
    ArrayList<VillagerStatusQuantityPair> villagerRequired; // (default: nil)
    String desirabilityLayer =""; //DESIRABILITY (default: nil)
    boolean isManuallyUnlocked = false; //boolean (default: false)
    boolean isDestructible = true; //boolean (default: true)
    boolean isEditable = false; //boolean (default: false)
    boolean isHidden = false; //boolean (default: false)
    boolean isClearTrees = false; //default: false
    // ArrayList<MaterialSet> materialSetArrayList; //Optional underConstruction

}