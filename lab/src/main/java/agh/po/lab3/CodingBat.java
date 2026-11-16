package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");

            if (a.length() > b.length()) {
                map.put("c", a);
            } else if (b.length() > a.length()) {
                map.put("c", b);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;


    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (String s : strings) {
            String first = s.substring(0, 1);
            String last = s.substring(s.length() - 1);
            map.put(first, last);
        }

        return map;
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        Map<String, String> testMap1 = new HashMap<>();
        testMap1.put("a", "aaa");
        testMap1.put("b", "bb");
        testMap1.put("c", "cake");
        System.out.println("Wynik 1: " + cb.mapAB4(testMap1));

        Map<String, String> testMap2 = new HashMap<>();
        testMap2.put("a", "aa");
        testMap2.put("b", "bb");
        System.out.println("Wynik 2: " + cb.mapAB4(testMap2));
    }


}