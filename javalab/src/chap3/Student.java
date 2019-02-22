package chap3;

public class Student {
    private String studentId;
    private String studentName;
    private String facuty;
    private String major;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, String facuty) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.facuty = facuty;
    }

    public Student(String studentId, String studentName, String facuty, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.facuty = facuty;
        this.major = major;
    }
    
   void show(){
       System.out.println("======================");
       System.out.println("ID :"+studentId);
       System.out.println("Name :"+studentName);
       System.out.println("Facuty :"+facuty);
       System.out.println("Major :"+major);
       System.out.println("======================");
      
   }
    

    public static void main(String[] args) {
        Student s1 =  new Student();
        s1.show();
        
        Student s2 =  new Student("066");
        s2.show();
        
        Student s3 =  new Student("066","Sararat");
        s3.show();
        
        Student s4 = new Student("066","ToTo","Science and Tecnology");
        s4.show();
        
        Student s5 = new Student("066","ToTo","ScienceTecnology","ComputerScience");
        s5.show();
    }

}


