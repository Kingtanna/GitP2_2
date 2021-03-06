package cn.school.thoughtworks.section3;

import java.util.*;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collection3 = new HashMap<>();
        for(String s : collectionA){
            collection3.put(s,collection3.get(s)==null?1:collection3.get(s)+1);
        }
        List<String> list = object.get("value");
        for(String s : collection3.keySet()){
            if(list.contains(s)){
                int temp = collection3.get(s);
                collection3.put(s, temp-(temp/3));
            }
        }
        return collection3;

    }
}
