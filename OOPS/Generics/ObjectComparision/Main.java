package Generics.ObjectComparision;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student(12, 89.76f);
        Student s2 = new Student(13, 90.76f);

        /*if(s1 > s2){ which parameter are we comparing ? rollNo pr marks ? to compare we use comparable interface
            System.out.println("Student 1 has more marks");
        } else {
            System.out.println("Student 2 has more marks");
        }*/
       //we write the above as following
       if(s1.compareTo(s2) > 0){
            System.out.println("Student 1 has more marks");
        } else {
            System.out.println("Student 2 has more marks");
        }
    }
}
