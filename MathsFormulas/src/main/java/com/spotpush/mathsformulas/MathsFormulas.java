/*
Mathamatic formulas 
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.mathsformulas;

import java.util.ArrayList;

/* Imports */

public class MathsFormulas 
{
    public static void main(String[] args) 
    {
    }
    
    double distanceFormula(double x1, double x2, double y1, double y2)
    {
        double distanceXY = Math.sqrt((Math.pow((y1-x1),2)+Math.pow((y2-x2), 2)));
        return distanceXY;
    }
    
    double slopeFormula(double x1, double x2, double y1, double y2)
    {
        double SlopeXY = ((y2-y1)/(x2-x1));
        return SlopeXY;
    }
    
    double pythagoreanFormula(double a, double b)
    {
        double pythagoreanABC = (Math.sqrt((Math.pow(a,2))+(Math.pow(b,2))));
        return pythagoreanABC;
    }
    
    //return multiple values of the same type
    ArrayList<Double> midpoint(double x1, double x2, double y1, double y2) {
        
        ArrayList<Double> midPointValues = new ArrayList<>();
        midPointValues.add((x1+x2)/2);
        midPointValues.add((y1+y2)/2);
        return midPointValues;
    }
     
    double areaoftriangle(double base, double height) {
        double aot = (base*height)/2;
        return aot;
    }
    
    double trigonometrysine(double opposite, double hypotenuse){
        double tSine = opposite/hypotenuse;
        return tSine;
    }

}