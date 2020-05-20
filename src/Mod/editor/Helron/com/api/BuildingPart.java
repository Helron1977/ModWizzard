package Mod.editor.Helron.com.api;

import java.util.ArrayList;

public class BuildingPart {


    String dataType = "BUILDING_PART";
    String id = "BuildingName_PART";
    String name = "string";
    String description = "string";
    String category = "string";
    boolean hasMaximumInstancePerBuilding = false; //boolean (default: false),
    int maximumInstancePerBuilding = 0;//integer (default: 0),
    String mover = ""; //BUILDING_PART_MOVER,
    String constructorData = "BUILDING_CONSTRUCTOR";
    String assetBuildingFunction = "";//(default: nil),//Optional
    String buildingZone = "BUILDING_ZONE"; //optional
    String constructionVisual = "PREFAB";//Optional(default: nil)
    ArrayList<EstateQuantityPair> estateSplendorArrayList; //list<ESTATE_QUANTITY_PAIR>,
    ArrayList<BuildingPartCost> cost ;
    int capacity = 0; //integer (default: 0),
    ArrayList<DesirabilityModifierItem> desirabilityModifiers ; //list<DESIRABILITY_MODIFIER_ITEM>,





//Property
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isHasMaximumInstancePerBuilding() {
        return hasMaximumInstancePerBuilding;
    }

    public void setHasMaximumInstancePerBuilding(boolean hasMaximumInstancePerBuilding) {
        this.hasMaximumInstancePerBuilding = hasMaximumInstancePerBuilding;
    }

    public int getMaximumInstancePerBuilding() {
        return maximumInstancePerBuilding;
    }

    public void setMaximumInstancePerBuilding(int maximumInstancePerBuilding) {
        this.maximumInstancePerBuilding = maximumInstancePerBuilding;
    }

    public String getMover() {
        return mover;
    }

    public void setMover(String mover) {
        this.mover = mover;
    }

    public String getConstructorData() {
        return constructorData;
    }

    public void setConstructorData(String constructorData) {
        this.constructorData = constructorData;
    }

    public String getAssetBuildingFunction() {
        return assetBuildingFunction;
    }

    public void setAssetBuildingFunction(String assetBuildingFunction) {
        this.assetBuildingFunction = assetBuildingFunction;
    }

    public String getBuildingZone() {
        return buildingZone;
    }

    public void setBuildingZone(String buildingZone) {
        this.buildingZone = buildingZone;
    }

    public String getConstructionVisual() {
        return constructionVisual;
    }

    public void setConstructionVisual(String constructionVisual) {
        this.constructionVisual = constructionVisual;
    }

    public ArrayList<EstateQuantityPair> getEstateSplendorArrayList() {
        return estateSplendorArrayList;
    }

    public void setEstateSplendorArrayList(ArrayList<EstateQuantityPair> estateSplendorArrayList) {
        this.estateSplendorArrayList = estateSplendorArrayList;
    }

    public ArrayList<BuildingPartCost> getCost() {
        return cost;
    }

    public void setCost(ArrayList<BuildingPartCost> cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<DesirabilityModifierItem> getDesirabilityModifiers() {
        return desirabilityModifiers;
    }

    public void setDesirabilityModifiers(ArrayList<DesirabilityModifierItem> desirabilityModifiers) {
        this.desirabilityModifiers = desirabilityModifiers;
    }
}
