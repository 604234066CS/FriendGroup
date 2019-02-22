package chap3;


public class CallEmployee {
    public static void main(String[] args) {
        System.out.println("ID :"+Employee.id);
        Employee.work();
        
        Employee empObj = new Employee();        
        System.out.println("ID :"+empObj.name);
        System.out.println("ID :"+empObj.age);
        empObj.getSalary();
    }
    
}
