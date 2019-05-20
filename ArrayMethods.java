package com.company;

import java.util.Arrays;

public class ArrayMethods {


    public ArrayMethods() { }

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
}
