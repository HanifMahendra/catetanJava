package generics;

public class Main {
    public static void main(String[] args) {
        
        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        Box<String> box = new Box<>();

        box.setItem("SSD 32GB x1 price is: $100.0");
        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("RTX 4070Ti", 500.0);
        System.out.print(product.getItem() + " price is: $");
        System.out.println(product.getPrice());
    }
}