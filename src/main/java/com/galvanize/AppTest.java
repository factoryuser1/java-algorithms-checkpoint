package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {

        String word = "hellooo";
        HashMap<String, Integer> result = new HashMap<>();

        List<String> myList = new ArrayList<>(Arrays.asList(word.split("")));
        result.put(myList.get(0),0);

        int counter = 0;
        //iterate over every letter in the list
        for (int i = 0; i < myList.size() ; i++) {
            //if h is not in the hashmap,
                //put in the hashmap, put 1
            //if else h is already in the hashmap
                //get the value at h and update the hasmap with incremented value
            //****************NO Need
//            counter = 0;
//            for (int j = 0; j < myList.size(); j++) {
//                if (myList.get(i).equals(myList.get(j))){
//                    counter++;
//                } else {
//                    result.put(myList.get(i), counter);
//                }
            //****************NO Need
//            }
        }
        System.out.println(result);

//        String word = "hellooo";
//        List<String> myList = new ArrayList<>(Arrays.asList(word.split("")));
//        System.out.println(myList);
//        System.out.println(Book.contents());
//        System.out.println(Tractor.addFuel());

//        ArrayList<String> items = new ArrayList<>();
//        items.add("wheels");
//        ArrayList<String> items2 = items;
//        items.add("on screen display");
//        System.out.println(items2.get(1));
        //System.out.println(items2.get(0));

    }
}
