package com.company;

import java.util.Scanner;

public class Main {


    static boolean isPalindrome(String str)
    {

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.print("Yes, " +str+ " is a Palindrome");
        else
            System.out.print("No, " +str+ " is not a Palindrome");
    }
}