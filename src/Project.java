public class Project {
    String modName;
    String fbxName;

    public Project(){
        modName="modName";
        fbxName= modName+".fbx";
    }

    public Project(String modName, String fbxName) {
        this.modName = modName;
        this.fbxName = fbxName;
    }
}
