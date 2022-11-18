package ru.vsu.cs.mitrakov;

import java.util.HashSet;

public class Main {
   public static void main(String args[]){

      /*MyHashSet<String> set = new MyHashSet<>();
      set.add("Test");
      System.out.println(set.contains("Test"));
      System.out.println(set.contains("Test1"));
      set.add("Test1");
      System.out.println(set.contains("Test1"));
      set.remove("Test");
      System.out.println(set.contains("Test"));*/
      MyHashMultiSet<String> set1 = new MyHashMultiSet<>();
      set1.add("Test1");
      System.out.println(set1.contains("Test1"));
      set1.add("Test1");
      System.out.println(set1.size());
      System.out.println(set1.contains("Test1"));
      set1.remove("Test1");
      System.out.println(set1.contains("Test1"));
      System.out.println(set1.size());
      set1.remove("Test1");
      System.out.println(set1.contains("Test1"));
   }

}
