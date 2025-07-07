package perfectPractice2025;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Set;

public class Explore {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Mallik");
        map.put(5, "Mallik");
        map.put(6, "KV");
        map.put(8, "KVM");
        map.put(9, "Arjun");
        map.put(3, "KV");
        map.put(4, "KVM");
        map.put(2, "Arjun");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        List<String> values = (List<String>) map.values();
        System.out.println(values);
    }
}
