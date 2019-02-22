package chap4;

import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name :");
        String name = sc.next();
        System.out.println("Name :"+name);
        
        System.out.print("Please enter enter your age :");
        int age = sc.nextInt();
        System.out.println("Age :"+age);
        
        System.out.print("Please enter your salary :");
        double salary = sc.nextDouble();
        System.out.print("Salary :"+salary);
        
        System.out.print("Please enter your degree :");
        int degree = sc.nextInt();
        System.out.print("Degree :"+degree);
        
        System.out.print("Please enter your sex :");
        String sex = sc.next();
        System.out.println("Sex :"+sex);
        
       
        
        
        
    }
    
}
