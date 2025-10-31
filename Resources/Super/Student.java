package Super;

public class Student extends Person{
    
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last); // Untuk assign variable yang ada di parent class, gunakan super()
        this.gpa = gpa;
    }

    void showStats(){
        System.out.println(this.first + " " + this.last + " GPA is: " + this.gpa);
    }
}
