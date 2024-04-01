package org.CollectionAndDSA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOperations {

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //Add Elements
        map.put("Age", 30);
        map.put("Birth Year", 1993);
        System.out.println("-----------------");
        //print the size and elements
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
        }

        System.out.println("-----------------");
        //replace values and print
        map.replace("Age", 29);

        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println("Key : " + key + ", value : " + map.get(key));
        }

        System.out.println("-----------------");
        //add new collection/map
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Birth Month", 6);
        map.put("Birth Month", 6);
        map.remove("Age");

        Iterator<Entry<String, Integer>> entrySet = map.entrySet().iterator();
        while (entrySet.hasNext()){
            Entry<String, Integer> entry = entrySet.next();
            System.out.println("Key : " + entry.getKey() +", value : " + entry.getValue());
        }

        System.out.println("-----------------");
        //print using streams and lamba
        map.forEach((k,v) -> System.out.println("Key : " + k +", value : " + v));

    }




}
