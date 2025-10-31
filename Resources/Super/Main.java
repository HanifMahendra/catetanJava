package Super;

public class Main {
    public static void main(String[] args){

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes
        
        Person person1 = new Person("Hanif", "Mahendra");
        Student student1 = new Student("Hanif", "Mahendra", 3.6);
        Employee employee1 = new Employee("Hanif", "Mahendra", 1000);
        person1.showName();
        student1.showStats();
        employee1.showSalary();
    }
}
