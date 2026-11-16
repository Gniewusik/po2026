package agh.po.lab3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {

    @Test
    public void mapAB4() {
        CodingBat cb = new CodingBat();

        // a dluzsze niz b
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        map1.put("c", "cake");

        cb.mapAB4(map1);
        assertEquals("aaa", map1.get("c"));

        // b dluzsze niz a
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "bb");
        map2.put("b", "aaa");

        cb.mapAB4(map2);
        assertEquals("aaa", map2.get("c"));

        // a i b równe
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bb");

        cb.mapAB4(map3);
        assertEquals("", map3.get("a"));
        assertEquals("", map3.get("b"));
    }

    @Test
    public void pairsTest() {
        CodingBat cb = new CodingBat();

        // proste różne pierwsze litery
        String[] input1 = {"code", "bug"};
        Map<String, String> expected1 = Map.of("b", "g", "c", "e");
        assertEquals(expected1, cb.pairs(input1));

        // powtarzająca się pierwsza litera
        String[] input2 = {"man", "moon", "main"};
        Map<String, String> expected2 = Map.of("m", "n");
        assertEquals(expected2, cb.pairs(input2));

        // wielokrotne słowa i nadpisywanie
        String[] input3 = {"man", "moon", "good", "night"};
        Map<String, String> expected3 = Map.of("g", "d", "m", "n", "n", "t");
        assertEquals(expected3, cb.pairs(input3));

        // tablica pusta
        String[] input4 = {};
        Map<String, String> expected4 = Map.of();
        assertEquals(expected4, cb.pairs(input4));
    }
}