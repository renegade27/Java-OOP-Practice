package human;

public class Koth {
    public static void main(String[] args) {
        Human hank = new Human("Hank", "Brown", 32, 5.9);
        Human peggy = new Human("Peggy", "Brown", 30, 5.6);
        Human bobby = new Human(5.3);

        System.out.println(hank);
        System.out.println(hank.getName() + " is " + hank.getAge() + " years old and " + hank.getHeight() + " feet tall.");
        hank.setName("Hanky");
        System.out.println(hank.getName() + " is " + hank.getAge() + " years old and " + hank.getHeight() + " feet tall.");

        System.out.println(peggy);
        System.out.println(peggy.getName() + " is " + peggy.getAge() + " years old and " + peggy.getHeight() + " feet tall.");
        peggy.setName("Peg");
        System.out.println(peggy.getName() + " is " + peggy.getAge() + " years old and " + peggy.getHeight() + " feet tall.");

        System.out.println(bobby);
        System.out.println(bobby.getName() + " is " + bobby.getAge() + " years old and " + bobby.getHeight() + " feet tall.");
        bobby.setName("Bobby");
        System.out.println(bobby.getName() + " is " + bobby.getAge() + " years old and " + bobby.getHeight() + " feet tall.");
    }
}