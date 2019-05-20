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

        ListOfString listOfString = new ListOfString();
        ArrayList<String> list = listOfString.getListOfString(size);

        System.out.println("Original list : " + list.toString());
        System.out.println("Sorted list : " + listOfString.sortList(list));


    }


}

