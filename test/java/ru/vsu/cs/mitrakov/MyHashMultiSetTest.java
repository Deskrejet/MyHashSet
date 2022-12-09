package ru.vsu.cs.mitrakov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MyHashMultiSetTest {

    @org.junit.jupiter.api.Test
    void size() {
        MyHashMultiSet<String> set1 = new MyHashMultiSet<>();
        set1.add("Test1");
        set1.add("Test1");
        assertEquals(set1.size(),2);
        set1.remove("Test1");
        assertEquals(set1.size(), 1);
        set1.clear();
        assertEquals(set1.size(), 0);
    }

    @Test
    void isEmpty() {
        MyHashMultiSet<String> set1 = new MyHashMultiSet<>();
        set1.add("Test1");
        set1.add("Test1");
        assertFalse(set1.isEmpty());
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    void contains() {
        MyHashMultiSet<String> set1 = new MyHashMultiSet<>();
        set1.add("Test1");
        set1.add("Test1");
        assertTrue(set1.contains("Test1"));
        assertFalse(set1.contains("Test2"));
    }

    @Test
    void add() {
        MyHashMultiSet<String> set1 = new MyHashMultiSet<>();
        set1.add("Test1");
        set1.add("Test1");
        assertTrue(set1.contains("Test1"));
    }

    @Test
    void remove() {
    }

    @Test
    void clear() {
    }
}