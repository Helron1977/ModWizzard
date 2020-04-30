package Mod.editor.Helron.com;

public class Project {
    public String modName;
    public String fbxName;

    public Project(String modName, String fbxName) {
        this.modName = modName;
        this.fbxName = fbxName;
    }

    public void createCode() {
            System.out.print(  "local "+modName+" = foundation.createMod();\n"

            +"--myMod:logWarning(\"This is a warning from "+modName+" mod!\")\n"

            +"--myMod:logError(\"This is an error from "+modName+" mod!!\")\n"

            +"--myMod:msgBox(\"Hello there! from "+modName+" mod!\")\n"

            +"-- Apply building asset processor\n"


            +":registerAssetProcessor(\"models/"+fbxName+"\", {\n"

            +"\tDataType = \"BUILDING_ASSET_PROCESSOR\"\n"

            +"})\n"

            +modName+":registerAssetId(\"models/"+fbxName+"/Prefab/"+ modName.toLowerCase()+"Part\", \"PREFAB_"+modName.toUpperCase()+"\")\n"

            +modName+":registerAssetId(\"models/"+fbxName+"/Prefab/Construction_Steps\", \"PREFAB_"+modName.toUpperCase()+"_CONSTRUCTION\")\n"

            +modName+":dofile(\"scripts/buildings.lua\")");


    }

}
