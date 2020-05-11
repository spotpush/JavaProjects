/*
User input 
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.mathsformulas;

/* Imports */
import java.util.ArrayList;
import java.util.Scanner;

public class MathsFormulasUserInput 
{
    //Examples of declaring global variables - Aviod not bets practice
    //by decaring the scanner object usrObj as public static
    //it can be called by any method with this class saving time
    //declaring new object every time it's needed
    //public static final Scanner USROBJ = new Scanner(System.in);
    //public static final MathsFormulas MATHSFORMULAS = new MathsFormulas();
    
    //Class Variables
    Scanner usrObj = new Scanner(System.in);
    MathsFormulas MathsFormulas = new MathsFormulas();
    
    public static void main(String[] args) 
    {
        
    }
                
    double distanceFormulaUserInput ()
    {
        //takes user input for calculating DistanceFormula
        //Scanner usrObj = new Scanner(System.in);
        System.out.println("Enter first co-ordinate:");
        System.out.print("x1 = ");
        double x1 = usrObj.nextDouble();
        System.out.print("x2 = ");
        double x2 = usrObj.nextDouble();
        System.out.println("Enter second co-ordinate:");
        System.out.print("y1 = ");
        double y1 = usrObj.nextDouble();
        System.out.print("y2 = ");
        double y2 = usrObj.nextDouble();
                
        //double dFormula = MathsFormulas.distanceFormula(x1, x2, y1, y2);
        //return dFormula;
        return MathsFormulas.distanceFormula(x1, x2, y1, y2);
    }
    
    double slopeFormula()
    {
        System.out.println("First point co-ordinates:");
        System.out.print("x1 = ");
        double x1 = usrObj.nextDouble();
        System.out.print("x2 = ");
        double x2 = usrObj.nextDouble();
        System.out.println("Second point co-ordinates:");
        System.out.print("y1 = ");
        double y1 = usrObj.nextDouble();
        System.out.print("y2 = ");
        double y2 = usrObj.nextDouble();

        double sFormula = MathsFormulas.slopeFormula(x1,x2,y1,y2);
        return sFormula;
    }
    double pythagoreanTheorem()
    {
        System.out.println("Enter 'a' value: ");
        System.out.print("a = ");
        double a = usrObj.nextDouble();
        System.out.print("b = ");
        double b = usrObj.nextDouble();
        
        double ptFormula = MathsFormulas.pythagoreanFormula(a, b);
        return ptFormula;
    }
    
    ArrayList<Double> midPoint() {
        System.out.println("Enter co-ordinates x1, x2, y1, y2");
        System.out.print("x1 = ");
        double x1 = usrObj.nextDouble();
        System.out.print("x2 = ");
        double x2 = usrObj.nextDouble();
        System.out.print("y1 = ");
        double y1 = usrObj.nextDouble();
        System.out.print("y2 = ");
        double y2 = usrObj.nextDouble();
        
        
        ArrayList<Double> array = MathsFormulas.midpoint(x1, x2, y1, y2);
        return array; 
        
    }
    
    double areaOfTriangle() {
        System.out.println("Enter 'base' and 'height' ");
        System.out.print("Base = ");
        double base = usrObj.nextDouble();
        System.out.print("Height = ");
        double height = usrObj.nextDouble();
        
        double AOT = MathsFormulas.areaoftriangle(base, height);
        return AOT;
    }
    
    double trigonometrySine() {
        System.out.println("Enter 'opposite' and 'hypotenuse' ");
        System.out.print("Opposite = ");
        double opposite = usrObj.nextDouble();
        System.out.print("Hypotenuse = ");
        double hypotenuse = usrObj.nextDouble();
        double tgSine = MathsFormulas.trigonometrysine(opposite, hypotenuse);
        return tgSine;
    }
    
    //public static void main(String[] args) 
    //{
    //    
    //}
    
}
