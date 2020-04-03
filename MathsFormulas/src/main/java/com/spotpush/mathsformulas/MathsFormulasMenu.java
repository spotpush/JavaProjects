/*
menu
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.mathsformulas;

/* Imports */
import java.util.ArrayList;
import java.util.Scanner;

public class MathsFormulasMenu 
{
    public static void main(String[] args) 
    {
        //this creates a MathsFormulasUserInput object called mathsFormulas
        //allowing return variables from MathsFormulasUserInput.*
        //to be visible to the main method of MathsFormulasMenu
        //a new instance of MathsFormulaUserImput class instantiated as userInput
        MathsFormulasUserInput userInput = new MathsFormulasUserInput();
        
        Scanner usrObj = new Scanner(System.in);
        System.out.println("1 - Calculate distance between 2 end points");
        System.out.println("2 - Calcuate Slope between 2 end points");
        System.out.println("3 - Pythagorean Theorem");
        System.out.println("4 - Midpoint");
        System.out.println("5 - Area of a Triangle");
        System.out.println("6 - Trigonometry - sine");
        System.out.println("10 - Quit ");
        System.out.println("Select from the above: ");
        int selection = usrObj.nextInt();
        
        switch (selection) 
        {
            case 1:
                double distCalculation = userInput.distanceFormulaUserInput();
                System.out.printf("Distance: %.2f",distCalculation);
                break;
            
            case 2:
                double slopeCalculation = userInput.slopeFormula();
                System.out.printf("Slope: %.2f", slopeCalculation);
                break;
            
            case 3:
               double pythagoreanCalculation = userInput.pythagoreanTheorem();
               System.out.print("Pythagorean Theorem - Length of C = "+pythagoreanCalculation);
               break;
            
            case 4:
                
                ArrayList<Double> arr = userInput.midPoint();
                System.out.print("MidPoint: "+arr);
                break;
                
            case 5:
                double aoTriangle = userInput.areaOfTriangle();
                System.out.printf("Area of Triangle = %.2f",aoTriangle);
                break;
                
            case 6:
                double trigoSine = userInput.trigonometrySine();
                System.out.println(trigoSine);
                break;
            
            case 10:
                System.out.printf("Bye");
                break;
        }
    }
}
