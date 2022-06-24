package com.company;

import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> odd_num = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i = i + 2)
            odd_num.add(i);
        System.out.println("First 50 odd numbers: "+odd_num);


        ArrayList<Integer> reverse_array = new ArrayList<Integer>();
        for (int i = odd_num.size()-1; i >= 0; i--)
            reverse_array.add(odd_num.get(i));
        System.out.println("Reverse of odd numbers: "+reverse_array);


        ArrayList<Double> even_num = new ArrayList<Double>();
        for (double i = 2.0; i <= 100.0; i = i + 2)
            even_num.add(i);
        System.out.println("First 50 even numbers: "+even_num);

        ArrayList<String> String = new ArrayList<String>();
        String.add("Joshna");
        String.add("is");
        String.add("a");
        String.add("angel");
        System.out.println("Given String: "+String);
    }
}
