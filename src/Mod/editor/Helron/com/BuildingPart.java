package Mod.editor.Helron.com;

import java.lang.reflect.Array;
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
    String constructionVisual = "PREFAB";//Optionnal(default: nil)
    ArrayList<EstateQuantityPair> estateSplendorArrayList; //list<ESTATE_QUANTITY_PAIR>,
    ArrayList<BuildingPartCost> cost ;
    int capacity = 0; //integer (default: 0),
    ArrayList<DesirabilityModifierItem> desirabilityModifiers ; //list<DESIRABILITY_MODIFIER_ITEM>,

}
