package OOPs;

public class staticKeyword {
    public static void main(String[] args) {
        //Student s1 = new Student();
        // s1.schoolName = "jmv";

        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        //gives output school name for s2 same as s1` 
    }
    
}
class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
