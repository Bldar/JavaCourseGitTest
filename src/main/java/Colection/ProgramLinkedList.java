package Colection;

import oop12.Math;

import java.util.LinkedList;

public class ProgramLinkedList {
    public static void main(String[] args) {
        LinkedList animals = new LinkedList<>();
        animals.add("Lion");
        animals.addLast("Bear");
        animals.addFirst("Lama");
        animals.add("Cat");
        animals.add("Mouse");
        System.out.println(animals);
        System.out.println(animals.get(0));
    }
}
