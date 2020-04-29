import java.lang.reflect.Field;

public class CodeBuilder extends Syntax {
    public CodeBuilder(Project project) {
    }

    public static String createBuildingCode(Building testBuilding) throws IllegalAccessException {
        Field[] params = Building.class.getDeclaredFields();
        for(int i=1; i<5;i++)
        {
            String code =params[i].getName()+equal()+doubleQuotationMark(params[i].get(testBuilding).toString())+endOfLine();
            System.out.print(code);
        }
        return "//End of code";
    }
}
