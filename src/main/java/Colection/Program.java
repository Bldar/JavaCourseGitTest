package Colection;

import javax.swing.*;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Sergey");
        people.add("Andrey");
        people.add("Anton");
        people.add("Liza");
        people.add(2, "qwerty");
        System.out.println(people.get(0));
        System.out.println(people);
        for (String person : people) {
            System.out.println(person);
        }
        if (people.contains("Sergey")) {
            System.out.println("чел в списке");
        }
        people.remove(0);
        System.out.println("чел в списке1");
        ArrayList<String> animals = new ArrayList<String>(3);


    }

    }



