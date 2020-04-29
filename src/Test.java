public class Test {


    public Test() throws IllegalAccessException {
        ModLuaFile test = new ModLuaFile("Gallows", "Gallows.fbx");
        Building testedBuilding = new Building("Gallows", "Gallows.fbx","GALLOWS_01","GALLOWS_NAME", "GALLOWS_DESC","DECORATION",0,"GENERAL");
        testModLuaLine01(test);
        testModLuaLine02(test);
        testModLuaLine03(test);
        testModLuaLine04(test);
        testModLuaLine05(test);
        testModLuaLine06(test);
        testModLuaLine07(test);
        testModLuaLine08(test);
        testModLuaLine09(test);
        testModLuaLine10(test);
        testModLuaLine11(test);
        //Begin of the BuildingLua Code test
        CodeBuilder.createBuildingCode(testedBuilding);


    }




    private void testModLuaLine11(ModLuaFile test) {
        String wantedResult = "Gallows:dofile(\"scripts/buildings.lua\")" ;
        String receivedResult = test.createCode(test.modName,11);
        if (!compareStrings(wantedResult,receivedResult))
            System.out.println(receivedResult + wantedResult);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 11");
    }


    private void testModLuaLine10(ModLuaFile test) {
        String wantedResult = "Gallows:registerAssetId(\"models/Gallows.fbx/Prefab/Construction_Steps\", \"PREFAB_GALLOWS_CONSTRUCTION\")\n" ;
        String receivedResult = test.createCode(test.modName,10);
        if (!compareStrings(wantedResult,receivedResult))
            System.out.println(receivedResult + wantedResult);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 10");

    }

    private void testModLuaLine09(ModLuaFile test) {
        String wantedResult = "Gallows:registerAssetId(\"models/Gallows.fbx/Prefab/gallowsPart\", \"PREFAB_GALLOWS\")\n" ;
        String receivedResult = test.createCode(test.modName,9);
        if (!compareStrings(wantedResult,receivedResult))
            System.out.println(receivedResult + wantedResult);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 09");
    }

    private void testModLuaLine08(ModLuaFile test) {
        String wantedResult = "})\n" ;
        String receivedResult = test.createCode(test.modName,8);
        if (!compareStrings(wantedResult,receivedResult))
            System.out.println(receivedResult + wantedResult);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 08");
    }

    private void testModLuaLine07(ModLuaFile test) {
        String wantedResult = "\tDataType = \"BUILDING_ASSET_PROCESSOR\"\n" ;
        String receivedResult = test.createCode(test.modName,7);
        if (!compareStrings(wantedResult,receivedResult))
            System.out.println(receivedResult + wantedResult);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 07");
    }

    private void testModLuaLine06(ModLuaFile test) {
        String wantedResult = "Gallows:registerAssetProcessor(\"models/Gallows.fbx\", {\n" ;
        String receivedResult = test.createCode(test.modName,6);
        if (!compareStrings(wantedResult,receivedResult))
            System.out.println(receivedResult + wantedResult);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 06");
    }

    private void testModLuaLine05(ModLuaFile test) {
        String wantedResult = "-- Apply building asset processor\n";
        String receivedResult = test.createCode(test.modName,5);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 05");
    }

    private void testModLuaLine04(ModLuaFile test) {
        String wantedResult = "--myMod:msgBox(\"Hello there! from Gallows mod!\")\n";
        String receivedResult = test.createCode(test.modName,4);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 04");
    }

    private void testModLuaLine03(ModLuaFile test) {
        String wantedResult = "--myMod:logError(\"This is an error from Gallows mod!!\")\n";
        String receivedResult = test.createCode(test.modName,3);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 03");
    }

    private void testModLuaLine02(ModLuaFile test) {
        String wantedResult = "--myMod:logWarning(\"This is a warning from Gallows mod!\")\n";
        String receivedResult = test.createCode(test.modName,2);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 02");
    }


    private void testModLuaLine01(ModLuaFile test) {
        String wantedResult = "local Gallows = foundation.createMod();\n";
        String receivedResult = test.createCode(test.modName,1);
        displayTest(compareStrings(wantedResult,receivedResult), "Test ModLua Line 01");

    }

    private void displayTest(boolean compareStrings, String testModLua) {
        if (compareStrings)
        {
            System.out.println( testModLua+" ok");
        }
        if (!compareStrings)
            System.out.println( testModLua+ " echec");
    }

    private boolean compareStrings(String wantedResult, String receivedResult) {
        return wantedResult.equals(receivedResult);
    }
}
/* "\n" +

 +

                "})\n" +
                "\n" +
                "-- Register the Mod and the PREFAB\n" +

                "Gallows:registerAssetId(\"models/Gallows.fbx/Prefab/gallowsPart\", \"PREFAB_GALLOWS\")\n" +
                "Gallows:registerAssetId(\"models/Gallows.fbx/Prefab/Construction_Steps\", \"PREFAB_GALLOWS_CONSTRUCTION\")\n" +
                "\n" +
                "Gallows:dofile(\"scripts/jobs.lua\")\n" +
                "Gallows:dofile(\"scripts/buildings.lua\")";*/