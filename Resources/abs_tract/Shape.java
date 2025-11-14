package abs_tract;

public abstract class Shape {
    // can't create any inner class, because this 'Shape' class is abstract

    abstract double area(); // ABSTRACT method -> If the childs classes didn't implement this method, the childs classes will ERROR!

    void display(){ // CONCRETE method -> in abstract class, concrete methods is Inherited, So we don't need to Override this method in the childs classes.
        System.out.println("This is a shape");
    }
}
