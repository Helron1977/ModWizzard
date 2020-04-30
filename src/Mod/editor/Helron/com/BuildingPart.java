package Mod.editor.Helron.com;

public class BuildingPart {


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

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public boolean isHasMaximumInstancePerBuilding() {
        return HasMaximumInstancePerBuilding;
    }

    public void setHasMaximumInstancePerBuilding(boolean hasMaximumInstancePerBuilding) {
        HasMaximumInstancePerBuilding = hasMaximumInstancePerBuilding;
    }

    public int getMaximumInstancePerBuilding() {
        return MaximumInstancePerBuilding;
    }

    public void setMaximumInstancePerBuilding(int maximumInstancePerBuilding) {
        MaximumInstancePerBuilding = maximumInstancePerBuilding;
    }

    public String getMover() {
        return Mover;
    }

    public void setMover(String mover) {
        Mover = mover;
    }

    public String getConstructorData() {
        return ConstructorData;
    }

    public void setConstructorData(String constructorData) {
        ConstructorData = constructorData;
    }

    public String getAssetBuildingFunction() {
        return AssetBuildingFunction;
    }

    public void setAssetBuildingFunction(String assetBuildingFunction) {
        AssetBuildingFunction = assetBuildingFunction;
    }

    public String getBuildingZone() {
        return BuildingZone;
    }

    public void setBuildingZone(String buildingZone) {
        BuildingZone = buildingZone;
    }

    public String getConstructionVisual() {
        return ConstructionVisual;
    }

    public void setConstructionVisual(String constructionVisual) {
        ConstructionVisual = constructionVisual;
    }

    public String getEstateSplendor() {
        return EstateSplendor;
    }

    public void setEstateSplendor(String estateSplendor) {
        EstateSplendor = estateSplendor;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public String getDesirabilityModifiers() {
        return DesirabilityModifiers;
    }

    public void setDesirabilityModifiers(String desirabilityModifiers) {
        DesirabilityModifiers = desirabilityModifiers;
    }
}
