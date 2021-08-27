package com.galvanize;


import java.util.*;

public class Algorithm {

    public boolean allEqual(String str) {

        return Arrays.stream(str.toLowerCase().split("")).distinct().count()==1;

//        String strArg = arg;
//        String firstLetter = strArg.substring(0, 1);
//
//        for (int i = 0; i <strArg.length()-1 ; i++) {
//            if (!firstLetter.equalsIgnoreCase(strArg.substring(i, i+1))) return false;
//        }
//        return false;
    }

    public Map<String, Long> letterCount(String str) {
        Map<String, Long> map = new HashMap<>();

        if (str.isEmpty()) return map;

        Arrays.stream(str.toLowerCase().split("")).forEach(c -> map.put(c, map.getOrDefault(c, 0L)+ 1));
        return map;
    }

    public String interleave(List<String> arr1, List<String> arr2) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr1.size(); i++) {

            sb.append(arr1.get(i)).append(arr2.get(i));
        }

        return sb.toString();
    }


}
