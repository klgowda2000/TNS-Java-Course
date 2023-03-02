package day6;


public class SLinheritanceDemo  {
    public static void main(String args[]){
        Student student = new Student("likith", "6876", "Chikkabanavara", 9880353238L, 5675, "RRIT");
        System.out.println(student.toString());
        Student s1 = new Student();
        System.out.println(s1.toString());
    }    
}
