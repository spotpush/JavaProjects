/**
* Check user Entry is as expected
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.StringExercises;
/* Imports */
import java.util.Scanner;




public class CompareUserEntry {

    
    public static void main(String[] args) {
    
        boolean valid = false;
        Scanner usrObj = new Scanner(System.in);
        do {
            System.out.println("Please enter 'Stephen', ");
            String userEntry = usrObj.nextLine();
            int strCompare = userEntry.compareTo("Stephen");
            if (strCompare > 0) System.out.println("Invalid Entry");
            else break;
        } while (!valid); 
            System.out.println("Valid Entry...Thanks");
              
    }
}
