package ru.vsu.cs.mitrakov;

import java.util.*;

public class MyHashMultiSet<T> extends AbstractSet<T> implements Set<T> {

    private final HashMap<T, ArrayList<Object>> map;

    private static int size = 0;
    private static final Object PRESENT = new Object();


    public MyHashMultiSet() {
        map = new HashMap<>();
    }
    public MyHashMultiSet(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }

    @Override
    public int size() {
        return size;
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

        if (!map.containsKey(e)){
            size ++;
            return map.put(e, new ArrayList<>())==null;
        }
        size ++;
        return map.get(e).add(e);
    }

    @Override
    public boolean remove(Object o) {
        if(map.get(o).size()<=0){
            size --;
            return map.remove(o)==PRESENT;
        }
        if(map.containsKey(o)){
            size --;
            return map.get(o).remove(o);
        }
        return false;
    }

    @Override
    public void clear() {
        map.clear();
        size = 0;
    }
}
