package Mod.editor.Helron.com;

public class Building {
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


    public Building(String dataType, String id, String name, String description, int orderId, String buildingType, String buildingModel, String villagerRequired, String desirabilityLayer, boolean isManuallyUnlocked, boolean isDestructible, boolean isEditable, boolean isHidden, boolean isClearTrees) {
        DataType = dataType;
        Id = id;
        Name = name;
        Description = description;
        OrderId = orderId;
        BuildingType = buildingType;
        BuildingModel = buildingModel;
        VillagerRequired = villagerRequired;
        DesirabilityLayer = desirabilityLayer;
        IsManuallyUnlocked = isManuallyUnlocked;
        IsDestructible = isDestructible;
        IsEditable = isEditable;
        IsHidden = isHidden;
        IsClearTrees = isClearTrees;
    }

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

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getBuildingType() {
        return BuildingType;
    }

    public void setBuildingType(String buildingType) {
        BuildingType = buildingType;
    }

    public String getBuildingModel() {
        return BuildingModel;
    }

    public void setBuildingModel(String buildingModel) {
        BuildingModel = buildingModel;
    }

    public String getVillagerRequired() {
        return VillagerRequired;
    }

    public void setVillagerRequired(String villagerRequired) {
        VillagerRequired = villagerRequired;
    }

    public String getDesirabilityLayer() {
        return DesirabilityLayer;
    }

    public void setDesirabilityLayer(String desirabilityLayer) {
        DesirabilityLayer = desirabilityLayer;
    }

    public boolean isManuallyUnlocked() {
        return IsManuallyUnlocked;
    }

    public void setManuallyUnlocked(boolean manuallyUnlocked) {
        IsManuallyUnlocked = manuallyUnlocked;
    }

    public boolean isDestructible() {
        return IsDestructible;
    }

    public void setDestructible(boolean destructible) {
        IsDestructible = destructible;
    }

    public boolean isEditable() {
        return IsEditable;
    }

    public void setEditable(boolean editable) {
        IsEditable = editable;
    }

    public boolean isHidden() {
        return IsHidden;
    }

    public void setHidden(boolean hidden) {
        IsHidden = hidden;
    }

    public boolean isClearTrees() {
        return IsClearTrees;
    }

    public void setClearTrees(boolean clearTrees) {
        IsClearTrees = clearTrees;
    }
}