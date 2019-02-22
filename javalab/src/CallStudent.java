public class CallStudent {
        public static void main(String[] args) {
        //me
        Student amObj = new Student();
        System.out.println(">> "+amObj);
        amObj.studentId = "604234066";
        amObj.studentName = "Srarat boonyodying";
        amObj.faculty = "Science and Tecnology";
        amObj.major = "Computer Science";
        
        System.out.println("Student Id :"+amObj.studentId);
        System.out.println("Student Name :"+amObj.studentName);
        System.out.println("Faculty :"+amObj.faculty);
        System.out.println("Major :"+amObj.major);
        
        amObj.enrollment("604234066");
        amObj.payment("604234066");
        amObj.addCourse("604234066");
        amObj.dropCourse("604234066");
        
        //my friend GraduateStudent
        GraduateStudent friend = new GraduateStudent ();
        friend.studentId = "604234066";
        friend.studentName = "Sararat boonyodying";
        friend.faculty = "Science and Tecnology";
        friend.major = "Computer Science";
        friend.studyLeval = "Master Degree";
        friend.thesisAdviser = "Sararat boonyodying";
        
          
        
        
            System.out.println("======= My Friend =======");
        friend.studyLeval = "Master Degree";
        friend.thesisAdviser = "Dr.Khem";
        friend.studentId = "604234045";
        friend.studentName = "Parina Seethong";
        friend.faculty = "Science and Tecnology";
        friend.major = "Computer Science";
        
        System.out.println("studentLevel : "+friend.studyLeval);
        System.out.println("Adviser : "+friend.thesisAdviser);
        System.out.println("Student Id :"+friend.studentId);
        System.out.println("Student Name :"+friend.studentName);
        System.out.println("Faculty :"+friend.faculty);
        System.out.println("Major :"+friend.major);
        
        friend.oralExamination("604234045");
        friend.thesisExamination("604234045");
        friend.enrollment("604234046");
        friend.payment("604234046");
        friend.addCourse("604234046");
        friend.dropCourse("604234046");    
               
    }
    
}
