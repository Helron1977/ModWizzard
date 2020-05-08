package Mod.editor.Helron.com.API;

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


    public Building(String dataType, String id, String name, String description, int orderId, String buildingType,
                    ArrayList<BuildingPartSet> buildingPartSetArrayList, String buildingModel, ArrayList<VillagerStatusQuantityPair> villagerRequired, String desirabilityLayer,
                    boolean isManuallyUnlocked, boolean isDestructible, boolean isEditable, boolean isHidden, boolean isClearTrees) {
        this.dataType = dataType;
        this.id = id;
        this.name = name;
        this.description = description;
        this.orderId = orderId;
        this.buildingType = buildingType;
        this.buildingPartSetArrayList = buildingPartSetArrayList;
        this.buildingModel = buildingModel;
        this.villagerRequired = villagerRequired;
        this.desirabilityLayer = desirabilityLayer;
        this.isManuallyUnlocked = isManuallyUnlocked;
        this.isDestructible = isDestructible;
        this.isEditable = isEditable;
        this.isHidden = isHidden;
        this.isClearTrees = isClearTrees;
    }
}