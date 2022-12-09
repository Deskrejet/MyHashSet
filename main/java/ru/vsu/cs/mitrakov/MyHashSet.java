package ru.vsu.cs.mitrakov;


import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet<T> extends AbstractSet<T> implements Set<T> {


    private final HashMap<T, Object> map;


    private static final Object PRESENT = new Object();


    public MyHashSet() {
        map = new HashMap<>();
    }
    public MyHashSet(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }


    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return map.keySet().toArray(new Object[map.size()]);
    }

    @Override
    public boolean add(T e) {
        return map.put(e, PRESENT)==null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

    @Override
    public void clear() {
        map.clear();
    }


}