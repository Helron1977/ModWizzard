public class Building extends Project{
    String DataType = "BUILDING";
    String Id = "GALLOWS_01";//rendre aléatoire
    String Name = "string";
    String Description = "string";
    int OrderId = 0; //Optionnal
    String BuildingType = "GENERAL";//building type
    //List BuildingPartSetList; //list<BUILDING_PART_SET>,
    String BuildingModel = "";//PREFAB (default: nil),
    String VillagerRequired = "{}"; //VILLAGER_STATUS_QUANTITY_PAIR (default: nil),
    String DesirabilityLayer = ""; //DESIRABILITY (default: nil),
    boolean IsManuallyUnlocked = false; //boolean (default: false),
    boolean IsDestructible = true; //boolean (default: true),
    boolean IsEditable = false; //boolean (default: false),
    boolean IsHidden = false; //boolean (default: false),
    boolean IsClearTrees = false; //boolean (default: false),
    //List MaterialSetList ; //list<MATERIAL_SET>,//Optional


    //question to solve :How to create an object with a variable number of param in the constructor ?
    //create a full constructor and init with default value
    //create a full constructor and set a null value...
    //if Default value or null value do not generate the code


    public Building(String modName, String fbxName, String dataType, String id, String name, String description, int orderId, String buildingType) {
        super(modName, fbxName);
        DataType = dataType;
        Id = id;
        Name = name;
        Description = description;
        OrderId = orderId;
        BuildingType = buildingType;
    }
}