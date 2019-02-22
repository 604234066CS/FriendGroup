package chap3;

public class Employee {
    static int id = 1001;
    String name = "Sararat";
    int age = 20;
    
    static void work(){
        System.out.println("work()");
       
    }
    
    void getSalary(){
        System.out.println("getSalary()");
        
    }
    
    public static void main(String[] args) {
        System.out.println("ID :"+id);
        work();
        
        
        Employee empObj = new Employee();        
        System.out.println("ID :"+empObj.name);
        System.out.println("ID :"+empObj.age);
        empObj.getSalary();
    }
}
