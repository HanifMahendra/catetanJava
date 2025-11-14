package abs_tract;

public class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area(){ // Since we inherit the abstract method from the parent class, this 'Circle' class will not ERROR
        return 0.5 * base * height;
    }
}
