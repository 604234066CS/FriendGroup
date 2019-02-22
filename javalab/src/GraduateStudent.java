public class GraduateStudent extends Student{
    protected String studyLeval;
    protected String thesisAdviser;
    
    public void oralExamination (String student){
        System.out.println("GraduateStudent : oralExamination");
    }
    public void thesisExamination (String student){
        System.out.println("GraduateStudent : thesisExamination");
    }

    @Override
    public void payment(String studentId) {
        System.out.println("Pay by Credit........");
    }
    
    
       
}//end class

    
