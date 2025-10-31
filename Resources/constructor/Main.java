package constructor;

public class Main {
    public static void main(String[] args){
    // constructor = A special method to initialize objects
    //               You can pass arguments to a constructor
    //               and set up initial values

    Student student1 = new Student("Yutori", 19, 3.1);
    Student student2 = new Student("Yakitori", 19, 3.5);

    System.out.println(student1.name);
    System.out.println(student1.age);
    System.out.println(student1.gpa);
    System.out.println(student1.isEnrolled + "\n"); // Hasilnya true karena di constructor, nilai awal = true

    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.gpa);
    System.out.println(student2.isEnrolled + "\n"); // Hasilnya true karena di constructor, nilai awal = true

    }

}
