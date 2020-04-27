import java.util.List;
import java.util.Random;

public class BuildingLuaFile implements Params {
    String DataType = "BUILDING";
    String Id = "GALLOWS_01";//rendre aléatoire
    String Name = "string";
    String Description = "string";
    int OrderId = 0;
    String BuildingType = "GENERAL";//building type
    List BuildingPartSetList; //list<BUILDING_PART_SET>,
    String BuildingModel = "";//PREFAB (default: nil),
    String VillagerRequired = "{}"; //VILLAGER_STATUS_QUANTITY_PAIR (default: nil),
    String DesirabilityLayer = ""; //DESIRABILITY (default: nil),
    boolean IsManuallyUnlocked = false; //boolean (default: false),
    boolean IsDestructible = true; //boolean (default: true),
    boolean IsEditable = false; //boolean (default: false),
    boolean IsHidden = false; //boolean (default: false),
    boolean IsClearTrees = false; //boolean (default: false),
    List MaterialSetList ; //list<MATERIAL_SET>,

    public BuildingLuaFile(String id, String name, String description, String buildingType) {
        DataType = "BUILDING";
        Id = id;
        Name = name;
        Description = description;
        BuildingType = buildingType;
    }

    public String createCode(BuildingLuaFile testBuilding) {

        return null;

    }
}
