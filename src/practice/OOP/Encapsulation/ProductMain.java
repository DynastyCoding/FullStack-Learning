package practice.OOP.Encapsulation;

public class ProductMain {
    public static void main(String[] args) {

        Product p1 = new Product("A76", "eraser", 15);
        Product p2 = new Product("B44", "pen", 25);

        p1.printInfo();
        p2.printInfo();

        System.out.println("ID: " + p2.getId());
        System.out.println("Name: " + p2.getName());
        System.out.println("Stock: " + p2.getStock());

        p2.setStock(20);
        p2.printInfo();

        p2.setStock(-15);
        p2.printInfo();
    }
}
