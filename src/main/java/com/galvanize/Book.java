package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Book {
    private String title;
    private String author;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static String contents(){
        return "Hello Reader!";
    }

    public static HashMap<String, Integer> characterCount(String letters){
        //String word = "hellooo";
        String word = letters;
        HashMap<String, Integer> result = new HashMap<>();

        List<String> myList = new ArrayList<>(Arrays.asList(word.split("")));
        result.put(myList.get(0),0);
        int counter;
        for (int i = 0; i < myList.size() ; i++) {
            for (int j = 0; j < myList.size(); j++) {
                counter = 1;
                if (myList.get(i).equals(myList.get(j))){
                    counter++;
                } else {
                    result.put(myList.get(i), counter);
                }
                //result.put(myList.get(i), counter);
            }
        }
        return result;
    }
}
