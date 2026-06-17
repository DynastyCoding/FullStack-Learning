package practice.OOP.Encapsulation;

public class Product {
    private String id;
    private String name;
    private int stock;

    public Product(String id, String name, int stock) {
        this.id = id;
        this.name = name;
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
            System.out.println("Invalid input, set to 0.");
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
            System.out.println("Invalid input, set to 0.");
        }
    }

    public void printInfo() {
        System.out.println(id + " | " + name + " | " + stock);
    }

}
