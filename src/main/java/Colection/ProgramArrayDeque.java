package Colection;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ProgramArrayDeque {
    public static void main(String[] args) {
        ArrayDeque <String>animals = new ArrayDeque();
        animals.addLast("Elefant");
        animals.addFirst("Tiger");
        animals.add("Puma");
        System.out.println(animals);
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());
        for (String animal:animals){
            System.out.println(animal);
        }
        System.out.println("________________________");
        while (animals.peek()!=null){
            System.out.println(animals.pop());
        }
    }
}
