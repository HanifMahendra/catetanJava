package Abstract;

public class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area(){ // Since we inherit the abstract method from the parent class, this 'Circle' class will not ERROR
        return length * width;
    }
}
