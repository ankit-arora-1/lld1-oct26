package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    public static void printName(Animal animal) {
        System.out.println(animal.getName());
    }


    public static void printNames(List<Animal> animals) {
        for(Animal animal: animals) {
            System.out.println(animal.getName());
        }
    }

    public static void printNames2(List<? extends Animal> animals) {
        // animals.add(new Dog("Asdas"));
       for(Object animal: animals) {
           //System.out.println(animal.getName());
       }
    }

    public static <T extends Animal> T printNamesAndGetLastValue(List<T> animals) {
        for(Animal animal: animals) {
            System.out.println(animal.getName());
        }

        return animals.get(animals.size() - 1);
    }

    public static void main(String[] args) {
        // Pair p = new Pair();

    }
}