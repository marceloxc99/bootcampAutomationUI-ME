package util;

public class Property {
    private static String nameProperty;
    public static String getTestSuiteProperties (){
        nameProperty = "yopmail";

        switch (nameProperty){
            case "todoist":
                nameProperty = "todoist.properties";
                break;
            case "todoly":
                nameProperty = "todoly.properties";
                break;
            case "yopmail":
                nameProperty = "yopmail.properties";
                break;
            default:
                nameProperty = "Invalid properties";
                break;
        }
        return nameProperty;
    }
}
