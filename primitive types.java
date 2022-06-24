package com.company;

public class Main {

    public static void main(String[] args) {

        int myvalue = 10000;
        byte myBytevalue = 120;
        short myShortvalue= 20000;
        long myLongTotal= 50000 + 10 * (myvalue + myBytevalue + myShortvalue) ;
         System.out.println("int value =" + myvalue);
        System.out.println("byte value =" + myBytevalue);
        System.out.println("short value =" + myShortvalue);
        System.out.println("long value =" + myLongTotal);

    }
}
