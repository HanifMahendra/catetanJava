package gettersetter;

public class Car {
    
    private String model;
    private String color;
    private int price;

    // PERBEDAAN CONSTRUCTOR DAN SETTER
    // CONSTRUCTOR = Menetapkan state awal yang diperlukan.
    // SETTER = Memungkinkan perubahan state setelah pembuatan.

    // CONSTRUCTOR
    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // GETTERS
    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }

//  Bisa begini juga:
//  String getPrice(){
//      return "$" + this.price;
//  }


    // SETTERS
    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be less than zero");
        }
        else{
            this.price = price;
        }
    }

    void setModel(String model){
        this.model = model;
    }
}
