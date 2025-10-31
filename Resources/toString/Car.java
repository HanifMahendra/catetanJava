package toString;

public class Car {
    
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }

    // Jadi fungsi nya toString, kalau di Main.java mau print yang membutuhkan class Car ini, di Main.java bisa langsung System.out.println(car) aja,
    // jadi gausah print panjang beserta car.color dst, karena di class Car, tepatnya di toString methodnya udah di definisikan, dia langsung Override.
}
