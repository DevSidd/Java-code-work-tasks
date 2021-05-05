package com.TasksWork;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class SortHashmapByKey {
    static HashMap<Integer, String> map = new HashMap<Integer, String>();
    public static void sortByKey() {
        TreeMap<Integer, String> sorted = new TreeMap<>();
        sorted.putAll(map);
        for (Map.Entry<Integer, String> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
    public static void main(String args[])
    {
        map.put(8, "Python");
        map.put(6, "Java");
        map.put(5, "JavaScript");
        map.put(7, "SQL");
        map.put(10, "HTML/CSS");

        sortByKey();
    }
}
