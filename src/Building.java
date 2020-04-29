import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;


public class Building extends ModLuaFile{
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


    public Building(String modName, String fbxName,String id, String name, String description, String buildingType) {
        super(modName, fbxName);
        DataType = "BUILDING";
        Id = id;
        Name = name;
        Description = description;
        BuildingType = buildingType;

    }
    public String doubleQuotationMark( String strToQuote){
        return "\""+strToQuote+"\"";
    }

    public String endOfLine(){
        return ",\n";
    }
    public String equal(){
        return " = ";
    }

    public String[][] params_Value(Building testBuilding){
        Field[] params = Building.class.getDeclaredFields();
        String[][] params_Value = new String[2][params.length];
        for ( int j=0; j< params.length; j++)
        {
            params_Value[1][j]=params[j].getName();
        }
        System.out.println(params_Value[1][1]);//test
        return params_Value;
    }
    public String createCode(Building testBuilding) throws IllegalAccessException {
        Field[] params = Building.class.getDeclaredFields();

        String code = modName+":register({" +params[0].getName()+equal()+doubleQuotationMark(DataType)+endOfLine()
                +params[1].getName()+equal()+doubleQuotationMark(params[1].get(testBuilding).toString())+endOfLine() //ready to factorise
                +params[2].getName()+equal()+doubleQuotationMark(Name)+endOfLine()
                +params[3].getName()+equal()+doubleQuotationMark(Description)+endOfLine()
                +params[4].getName()+equal()+doubleQuotationMark(BuildingType)+endOfLine();
        System.out.println(code);
        params_Value(testBuilding);


        return code;

    }

}
