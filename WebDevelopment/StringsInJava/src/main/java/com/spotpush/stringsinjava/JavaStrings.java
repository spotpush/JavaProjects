/**
* Handling Strings in Java
* Strings are associated with String Literals - strings contained within double quotes ""
* '+' operator is overloaded to perform on string objects and used to concatenate strings
* Strings are immutable - once created they can't be changed.  For example toUpperCase
* creates a new string object with upper case letters it doesn't amend the origin
* string it's being applied to
* String are immutable because String Literals with the same content share the same
* storage space (string common pool) in memory
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.stringsinjava;
/* Imports */


public class JavaStrings {

    /**
     * Class variables
     * instantiating two Strings staticString and nonstaticString
     * staticString is callable for all methods within JavaStrings class
     * nonstaticString
     */
    static String staticString = "This is a String";
    static String stringEquals = "This is a String";
    String nonstaticString = "This is a String";
    
    /**
     * String are immutable (can't be changed after it's created)
     * String Methods
     * @param args 
     */
    static void testStringLength() {
        JavaStrings jss = new JavaStrings();
        System.out.println(jss.nonstaticString.length()+" from a method");    
    }
    
    static void StringLength() {
        /**
         * Returns the length of a given string
         */
        System.out.println(staticString.length()+" including spaces...!");
    }
    
    static void UpperLower() {
        /**
         * Converts a string to UpperCase or Lowercase        
         */
        System.out.println(staticString.toUpperCase());
        System.out.println(staticString.toLowerCase());
    }
    
    static void indexOfString() {
        /**
         * indexOf - returns the index value of a given string within a string
         * java counts positions from 0. 0 being the first position ("T")
         * ("string",position) return first instance of 'string' after 'position'
         */
        System.out.println(staticString.indexOf("a")); //returns 8
        System.out.println(staticString.indexOf("r")); //returns 12
        System.out.println(staticString.indexOf("i")); // returns 2
        System.out.println(staticString.indexOf("i",4)); //returns 5 
    }
    
    static void startsWith() {
        /**
         * check to see if a string starts with a specific letter
         * check string at position 0.  Returns True/False
         * Case sensitive
         */
        System.out.println(staticString.startsWith("T")); //true
        System.out.println(staticString.startsWith("t")); //false
        System.out.println(staticString.startsWith("p")); //false
    }
    
    static void stringReplace() {
        /**
         * Replace a specific string
         * replaces beginning string only
         */
        System.out.println(staticString.replace("T", "a"));
    }
    
    static void stringIsEmpty() {
        /**
         * Check to see if a string is empty 
         * returns true/false
        */
        System.out.println(staticString.isEmpty());
    }
    
    static void stringHashCode() {
        /**
         * returns string Hash Code
         * 682948772
         * Formula s[0]*31^(n-1) + s[1]*31^(n-1) +... for each digit
         * s[] String index position
         * ^ to the power
         * n length of string. Decreases as you iterate over string
         */
        System.out.println(staticString.hashCode()); //682948772
    }
    
    static void stringEquals() {
        /**
         * Compare 2 strings returning true/false
         * 'string common pool' method for storing string literals with same value
         */
        String s1 = "Hello";
        String s2 = "Hello";
        //String s3 = new String("Hi");
        //String s4 = new String("Hi");
        
        
        //this style is used to compare string objects stored in heap
        //memory but is concidered bad practice
        //System.out.println("== "+(s3 == s4));
        
        //this uses the 
        System.out.println("equals " +s1.equals(s2));
        
    }
    
    static void stringEquality() {
        
    }
    
    static void stringFromat() {
        System.out.println("1.1234 to 1dp "+String.format("%.1f", 1.1234));
        System.out.println("1.1234 to 3dp "+String.format("%.3f", 1.1234));
    }
    
    public static void main(String[] args) {
        JavaStrings jss = new JavaStrings();
        System.out.println(jss.nonstaticString.length()+" from a ");
        System.out.println(staticString.length()+" from static variable");
        System.out.println("String length");
        StringLength();
        System.out.println("Upperase/Lowercase");
        UpperLower();
        System.out.println("String index...");
        indexOfString();
        System.out.println("Starts with...");
        startsWith();
        System.out.println("Replace String with...");
        stringReplace();
        System.out.println("Is string empty...");
        stringIsEmpty();
        System.out.println("String Hash Code...");
        stringHashCode();
        System.out.println("String Format...");
        stringFromat();
        System.out.println("String Equals...");
        stringEquals();
    }
}
