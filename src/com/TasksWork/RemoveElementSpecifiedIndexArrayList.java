package com.TasksWork;
import java.util.ArrayList;

public class RemoveElementSpecifiedIndexArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> languages = new ArrayList<String>(5);
        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("C");

        System.out.println("Languages ArrayList ="+ languages);
        System.out.println("Removing Element at Index 2");
        languages.remove(2);
        System.out.println("After Removing");
        System.out.println("Size of ArrayList : "+ languages.size());
        System.out.println("ArrayList"+ languages);
    }
}
