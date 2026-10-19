package generics;

public class Animal extends LivingBeing {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
