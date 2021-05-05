package com.TasksWork;

import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {
    public static void main(String[] args){
        Map<String, String> webs = new TreeMap<String, String>();
        webs.put("python.org", "python");
        webs.put("Java.org", "Java");
        webs.put("HTML.org", "HTML");
        webs.put("SQL.org", "SQL");
        webs.put("JavaScript.org", "JavaScript");

        for (Map.Entry<String, String> entry : webs.entrySet())
            System.out.println("[" + entry.getKey() + "," + entry.getValue() + "]");
    }
}
