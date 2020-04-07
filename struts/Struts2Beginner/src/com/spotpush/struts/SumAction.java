package com.spotpush.struts;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SumAction extends ActionSupport {
    private int x;
    private int y;
    private int sum;
     
    /**
     * The action method
     * @return name of view
     */
    public String calculate() {
        sum = x + y;
        return SUCCESS;
    }
    // setters and getters for x, y, and sum:
    public int getX() {
        return x;
    }
 
    public void setX(int x) {
        this.x = x;
    }
 
    public int getY() {
        return y;
    }
 
    public void setY(int y) {
        this.y = y;
    }
 
    public int getSum() {
        return sum;
    }
 
    public void setSum(int sum) {
        this.sum = sum;
    }
}