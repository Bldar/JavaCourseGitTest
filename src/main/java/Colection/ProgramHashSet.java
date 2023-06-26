package Colection;

import java.util.HashSet;

public class ProgramHashSet {
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<>();
        animals.add("Lion");
        animals.add("Rabbit");
        animals.add("lion");
        boolean isAdded = animals.add("Lion");
        System.out.println(animals);
    }
}
