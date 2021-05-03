package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int array1[] = {1,2,3,4,5,6,7};
        int array2[] = {8,6,33,100};
        int array3[] = {2, 55, 60, 97, 86};
        Main main = new Main();
        System.out.println(main.findSevenMethod(array1));
        System.out.println(main.findSevenMethod(array2));
        System.out.println(main.findSevenMethod(array3));
    }

    private String findSevenMethod(int[] arrayOfInts){
        String[] strArray = Arrays.stream(arrayOfInts)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        List<String> strings = Arrays.asList(strArray);
        ArrayList<Character> chars = new ArrayList<>();

        for (String str:strings) {
            chars.addAll(str.chars().mapToObj(e-> (char)e).collect(Collectors.toList()));
        }
        if(chars.contains('7')){
            return "Found";
        }else{
            return "there is no 7 in the array";

        }
    }


}
