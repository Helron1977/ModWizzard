public class ModLuaFile{
    // this class exist to create  pre formated strings and return those string in a file name mod.lua
    String modName;
    String fbxName;


    public ModLuaFile(String modName, String fbxName) {
        this.modName = modName;
        this.fbxName = fbxName;
        displayCode();
        createCode(modName,1);
        createCode(modName,2);
        createCode(modName,3);
        createCode(modName,4);
        createCode(modName,5);
        createCode(modName,6);
        createCode(modName,7);
        createCode(modName,8);
        createCode(modName,9);
        createCode(modName,10);
        createCode(modName,11);
    }

    private void displayCode() {
        System.out.println(createCode(modName,1)
                + createCode(modName,2)
                + createCode(modName,3)
                + createCode(modName,4)
                + createCode(modName,5)
                + createCode(modName,6)
                + createCode(modName,7)
                + createCode(modName,8)
                + createCode(modName,9)
                + createCode(modName,10)
                + createCode(modName,11)


        );
    }


    public String createCode(String modName, int lineNumber) {
        if (lineNumber==1)
            return  "local "+modName+" = foundation.createMod();\n";
        if(lineNumber==2)
            return "--myMod:logWarning(\"This is a warning from "+modName+" mod!\")\n";
        if(lineNumber==3)
            return "--myMod:logError(\"This is an error from "+modName+" mod!!\")\n";
        if(lineNumber==4)
            return "--myMod:msgBox(\"Hello there! from "+modName+" mod!\")\n";
        if(lineNumber==5)
            return "-- Apply building asset processor\n";

        if(lineNumber==6)
            return modName+":registerAssetProcessor(\"models/"+fbxName+"\", {\n";
        if(lineNumber==7)
            return "\tDataType = \"BUILDING_ASSET_PROCESSOR\"\n";
        if(lineNumber==8)
            return "})\n";
        if(lineNumber==9)
            return modName+":registerAssetId(\"models/"+fbxName+"/Prefab/"+ modName.toLowerCase()+"Part\", \"PREFAB_"+modName.toUpperCase()+"\")\n";
        if(lineNumber==10)
            return modName+":registerAssetId(\"models/"+fbxName+"/Prefab/Construction_Steps\", \"PREFAB_"+modName.toUpperCase()+"_CONSTRUCTION\")\n";
        if(lineNumber==11)
            return modName+":dofile(\"scripts/buildings.lua\")";

        else
        {return null;}
                // +
/*



                "Gallows:registerAssetId(\"models/Hood.fbx/Prefab/hood\", \"EXECUTIONER_HOOD_PREFAB\")\n" +
                "Gallows:registerAssetId(\"models/Gallows.fbx/Prefab/gallowsPart\", \"PREFAB_GALLOWS\")\n" +
                "Gallows:registerAssetId(\"models/Gallows.fbx/Prefab/Construction_Steps\", \"PREFAB_GALLOWS_CONSTRUCTION\")\n" +
                "\n" +
                "Gallows:dofile(\"scripts/jobs.lua\")\n" +
                "Gallows:dofile(\"scripts/buildings.lua\")";*/
    }



}
