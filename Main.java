package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        ArrayMethods ar = new ArrayMethods();
        Integer[] array = ar.getRandomArray(size);

        System.out.println("Original array : " + Arrays.toString(array));
        System.out.println("Sorted array : " + Arrays.toString(ar.sortArray(array)));
        System.out.println("Filtered array : " + Arrays.toString(ar.filterArray(array, (Integer a)->{return a*2;})));

        ListOfString listOfString = new ListOfString();
        ArrayList<String> list = listOfString.getListOfString(size);

        System.out.println("Original list : " + list.toString());
        System.out.println("Sorted list : " + listOfString.sortList(list));


    }


}

