/**
* Mutable Strings.  Stored in heap memory
* StringBuilder introduced in JDK 5, not synchronised for multi-thread operations
* but is more efficient for than stingBuffer for single-threaded operations
* StringBuffer synchronised for multi-threaded operations
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.stringsinjava;
/* Imports */


public class StringBuilderBuffer {

    public static void main(String[] args) {
        
        StringBuffer strBuf1 = new StringBuffer();
        StringBuffer strBuf2 = new StringBuffer(20);
        StringBuffer strBuf3 = new StringBuffer("Get Up...");
              
        
        StringBuilder strBui1 = new StringBuilder();
        StringBuilder strBui2 = new StringBuilder(50);
        StringBuilder strBui3 = new StringBuilder("Get Down...");
        
        strBuf3.append("Tomorrow");
        strBui3.append("NOW");
        System.out.println(strBui3+", "+strBuf3);
        
        strBui3.insert(8,"!");
        strBuf3.insert(0,"Lets ");
        System.out.println(strBui3+", "+strBuf3);
        
        int capacity = strBui3.capacity();
        System.out.println(capacity);
        
    }
}
