/**
* Print the ASCII values of a String
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.stringsinjava;
/* Imports */


public class StringASCII {

    static String str = "Golden Gate Bridge";
    
    public static void main(String[] args) {
        
        //String str="golden";
        System.out.println(str);
        System.out.println("ASCII values as follows");
        
        //char[] stringArray = str.toCharArray();
        for (int i=0;i<str.length();i++) {
            int asciiValue = str.charAt(i);
            System.out.println(asciiValue);
        }
        
    }
}
