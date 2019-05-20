package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfString {

    final Character[] LINE = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public ListOfString() { }

    public ArrayList<String> getListOfString(int size){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String str = "";
            int stringSize = (int)(30 * Math.random());

            for (int j = 0; j <stringSize ; j++) {
                Character[] chars = new Character[stringSize];
                chars[j] = LINE[(int)(30 * Math.random()% LINE.length)];
                str = str + chars[j];
            }
            list.add(str);
        }
        return list;
    }

    public ArrayList<String> sortList(ArrayList<String> list){
        ArrayList sortedArray = (ArrayList) list.clone();
        Collections.sort(sortedArray, (String a, String b)->{
            return b.compareTo(a); });
        return sortedArray;
    }
}
