package com.company;

import java.util.Arrays;

public class ArrayMethods {


    public ArrayMethods() { }

    Filtr filter = (Integer a) -> {return a = a + 2;};

    public Integer[] getRandomArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*8);
        }
        return array;
    }

    public Integer[] sortArray(Integer[] array) {
        Integer[] mass = Arrays.copyOf(array, array.length);
        Arrays.sort(mass, (Integer a, Integer b) -> {
            return Integer.compare(b,a);});
        return mass;
    }

    public Integer[] filterArray(Integer[] array, Filtr filter) {
        Integer[] selection = Arrays.copyOf(array, array.length);
        for (int i = 0; i < selection.length; i++) {
            selection[i] = filter.comp(selection[i]);
        }
        return selection;
    }
}
