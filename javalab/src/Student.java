public class Student {
    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;
    
    public void enrollment(String studentId){
        System.out.println("enrollment");
    }
    
    public void payment(String studentId){
        System.out.println("payment Packet");
    }
    
    public void addCourse(String studentId){
        System.out.println("addCourse");
        
    }
    
    public void dropCourse(String studentId){
        System.out.println("dropCourse");
        
    }
    

   
}

