public class BuildingPart {

    String DataType = "BUILDING_PART";
    String Id= "BuildingName_PART";
    String Name = "string";
    String Description ="string";
    String Category = "string";
    boolean HasMaximumInstancePerBuilding = false; //boolean (default: false),
    int MaximumInstancePerBuilding = 0;//integer (default: 0),
    //Mover = BUILDING_PART_MOVER,
    String ConstructorData = "BUILDING_CONSTRUCTOR";
    //AssetBuildingFunction = BUILDING_FUNCTION (default: nil),//Optional
    String BuildingZone = "BUILDING_ZONE"; //optional
    String ConstructionVisual = "PREFAB" ;//Optionnal(default: nil)
    //EstateSplendor = list<ESTATE_QUANTITY_PAIR>,
    String Cost = "BUILDING_PART_COST";
    //Capacity = integer (default: 0),
    //DesirabilityModifiers = list<DESIRABILITY_MODIFIER_ITEM>,
}
