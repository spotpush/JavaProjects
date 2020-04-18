/**
* Exercises for managing Strings
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.StringExercises;
/* Imports */


public class StringExcerices {

    static void question1(){
        String str = "Java Excerises!";
        System.out.println("The character at position 0 is "+ str.charAt(0));
        System.out.println("The character at position 0 is "+ str.charAt(10));
    }
    
    static void question2() {
        String str = "w3resources.com";
        System.out.println("Character (Unicode point) = "+str.codePointAt(1));
        System.out.println("Character (Unicode point) = "+str.codePointAt(9));
        
        //for (int i =0;i<str.length();i++){
        //    int uniCode = str.codePointAt(i);
        //    System.out.println(uniCode);
        //}
    }
    
    static void question3() {
        String str = "w3resources.com";
        System.out.println("Character (Unicode point) = "+str.codePointBefore(1));
        System.out.println("Character (Unicode point) = "+str.codePointBefore(9));
    }
    
    static void question4() {
        String str = "w3resources.com";
        System.out.println("Codepoint Count = "+str.codePointCount(0, 9));
    }
    
    static void question5() {
        /**
         * In the case of str1.compareTo(str2) str2 - str2
         * if the value is > 0 the 
         * It only compares string position 0
         */
        String str1 = "This is Exercise A";
        String str2 = "This is Exercise A";
        String str3 = "This is Exercise B";
        String str4 = "b";
        System.out.println(str1.compareTo(str2)+" strings are equal "); 
        System.out.println(str1.compareTo(str3)+" strings are not equal");
        System.out.println(str4.compareTo("b")+" strings equal");
        System.out.println(str4.compareTo("X")+" strings not equal");
        System.out.println("Test".compareTo("testdfdsfd"));
    }
    
    static void question6() {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        int equals = str1.compareToIgnoreCase(str2);
        if (equals > 0) {
            System.out.println("\"" + str1 + "\"" + " is less than " + "\"" +str2 + "\"");
        } else if (equals == 0) {
            System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" +str2 + "\"");
        } else
            System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" +str2 + "\"");
    }
    
    static void question7() {
        String str1 = "This is ";
        String str2 = "Java Programming";
        String str3 = str1.concat(str2);
        System.out.println(str3);
    }
    
    static void question8() {
        String str1 = "w3resource.com Java Programming Exercises";
        String str2 = "Java";
        boolean str3 = str1.contains(str2);
        if (str3 == true) {
            System.out.println("\""+str2+"\""+" is contained within "+"\""+str1+"\"");
        } else
            System.out.println("\""+str2+"\""+" is not present within "+"\""+str1+"\"");
    }
    
    static void question9() {
        String str1 = "example.com";
        String str2 = "Example.com";
        
    }
    
    public static void main(String[] args) {
    
        System.out.println("1 - Write a Java program to get the character at "
                + "the given index within the String. ");
        question1();
        System.out.println("2 - Write a Java program to get the character "
                + "(Unicode code point) at the given index within the String. ");
        question2();
        System.out.println("3 - Write a Java program to get the character "
                + "(Unicode code point) before the specified index within the String.");
        question3();
        System.out.println("4 - Write a java program to count a number of "
                + "Unicode code points in the specified text range of a String.");
        question4();
        System.out.println("5 - Write a java program to compare two strings "
                + "lexicographically.");
        question5();
        System.out.println("6 - Write a java program to compare two strings "
                + "lexicographically, ignoring case differences.");
        question6();
        System.out.println("7 - Write a Java program to concatenate a given "
                + "string to the end of another string.");
        question7();
        System.out.println("8 - Write a Java program to concatenate a given "
                + "string to the end of another string.");
        question8();
        
        
    }
}
