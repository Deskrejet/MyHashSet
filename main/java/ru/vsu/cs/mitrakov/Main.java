package ru.vsu.cs.mitrakov;

import java.util.HashSet;

public class Main {
   public static void main(String args[]){

      MyHashSet<String> set = new MyHashSet<>();
      set.add("Test");
      System.out.println(set.contains("Test"));
      System.out.println(set.contains("Test1"));
      set.add("Test1");
      System.out.println(set.contains("Test1"));
      set.remove("Test");
      System.out.println(set.contains("Test"));

   }

}
