package chap3;

import java.text.DecimalFormat;


public class CallCircle {
    public static void main(String[] args) {
        //creat Circle object
        Circle cirObj = new Circle(5.5);
        double interest = 12122114.0125;
        
        DecimalFormat df = new DecimalFormat("#,###,###,###.000");
        //call non-static variable
        System.out.println("Radius :"+ cirObj.getRadius());
        
        //call non-static method
        System.out.println("Area :"+cirObj.computeArea());
        System.out.println("Area :"+df.format(cirObj.computeArea()));
        
        System.out.println("Circunference :"+cirObj.computeCircumference());
        System.out.println("Circunference :"+df.format(cirObj.computeCircumference()));
                
        System.out.println("Diameter :"+cirObj.computeDiameter());
        System.out.println("Diameter :"+df.format(cirObj.computeDiameter()));
    }
    
}
