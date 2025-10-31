package Abstract;

public class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    double area(){ // Since we inherit the abstract method from the parent class, this 'Circle' class will not ERROR
        return Math.PI * radius * radius;
    }
}
