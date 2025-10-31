package constructor;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){ // Constructor
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // The parameter names can be different from the attributes name as long as the contrusctor (.this) refers to the attributes. Example:
    // Student(String a, int b, double c){
    // this.name = a;
    // this.age = b;
    // this.gpa = c;
    //}

    // Notes: you can change (this.) to "student1" or "student2" it still works the same.

    void study(){
        System.out.println(this.name + " is studying"); // After assigning values of your attributes using your constructor, you can use the constructor in your methods to.
    }
}
