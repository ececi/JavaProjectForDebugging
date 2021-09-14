public class MyParrot
{
    public final static String rootType = "Animal";
    private int age;
    private String name;
    private String type;

    public MyParrot(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString(){
        String parrotInfo = "Parrot info: \n";
        parrotInfo += "Root Type: " + rootType + "\n";
        parrotInfo += "Type: " + type + "\n";
        parrotInfo += "Name: " + name + "\n";
        parrotInfo += "Age: " + age;

        return parrotInfo;
    }
}
