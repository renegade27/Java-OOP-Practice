package human;

public class Human {

    private String name;
    private String hair_color;
    private int age;
    private double height;

    public Human(String name, String hair_color, int age, double height) {
        this.name = name;
        this.hair_color = hair_color;
        this.age = age;
        this.height = height;
    }

    public Human(double height) {
        this.name = "Bob";
        this.hair_color = "Brown";
        this.age = 15;
        this.height = height;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getHaircolor() {
        return hair_color;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHaircolor(String hair_color) {
        this.hair_color = hair_color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}


