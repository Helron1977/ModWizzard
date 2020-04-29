public class BuildingPart extends Project {


    String DataType = "BUILDING_PART";
    String Id= "BuildingName_PART";
    String Name = "string";
    String Description ="string";
    String Category = "string";
    boolean HasMaximumInstancePerBuilding = false; //boolean (default: false),
    int MaximumInstancePerBuilding = 0;//integer (default: 0),
    String Mover = ""; //BUILDING_PART_MOVER,
    String ConstructorData = "BUILDING_CONSTRUCTOR";
    String AssetBuildingFunction = "";//BUILDING_FUNCTION (default: nil),//Optional
    String BuildingZone = "BUILDING_ZONE"; //optional
    String ConstructionVisual = "PREFAB" ;//Optionnal(default: nil)
    String EstateSplendor = ""; //list<ESTATE_QUANTITY_PAIR>,
    String Cost = "BUILDING_PART_COST";
    int Capacity = 0; //integer (default: 0),
    String DesirabilityModifiers = ""; //list<DESIRABILITY_MODIFIER_ITEM>,

    public BuildingPart(){
        String DataType = "BUILDING_PART";
        String Id= "BuildingName_PART";
        String Name = "string";
        String Description ="string";
        String Category = "string";
        boolean HasMaximumInstancePerBuilding = false; //boolean (default: false),
        int MaximumInstancePerBuilding = 0;//integer (default: 0),
        String Mover = ""; //BUILDING_PART_MOVER,
        String ConstructorData = "BUILDING_CONSTRUCTOR";
        String AssetBuildingFunction = "";//BUILDING_FUNCTION (default: nil),//Optional
        String BuildingZone = "BUILDING_ZONE"; //optional
        String ConstructionVisual = "PREFAB" ;//Optionnal(default: nil)
        String EstateSplendor = ""; //list<ESTATE_QUANTITY_PAIR>,
        String Cost = "BUILDING_PART_COST";
        int Capacity = 0; //integer (default: 0),
        String DesirabilityModifiers = ""; //list<DESIRABILITY_MODIFIER_ITEM>,

    }


    public BuildingPart(String modName, String fbxName, String dataType, String id, String name, String description, String category, boolean hasMaximumInstancePerBuilding, int maximumInstancePerBuilding, String mover, String constructorData, String assetBuildingFunction, String buildingZone, String constructionVisual, String estateSplendor, String cost, int capacity, String desirabilityModifiers) {
        super(modName, fbxName);
    DataType = dataType;
    Id = id;
    Name = name;
    Description = description;
    Category = category;
    HasMaximumInstancePerBuilding = hasMaximumInstancePerBuilding;
    MaximumInstancePerBuilding = maximumInstancePerBuilding;
    Mover = mover;
    ConstructorData = constructorData;
    AssetBuildingFunction = assetBuildingFunction;
    BuildingZone = buildingZone;
    ConstructionVisual = constructionVisual;
    EstateSplendor = estateSplendor;
    Cost = cost;
    Capacity = capacity;
    DesirabilityModifiers = desirabilityModifiers;
}

}
