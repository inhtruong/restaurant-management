package Product;

public class Product {
    private int ID = 0;
    private String name;
    private int price;
    private int quantity;
    private String category;

    public Product() {

    }

    public Product(String nameProduct, int priceProduct, int quantityProduct, String categoryProduct) {
        this.ID++;
        this.name = nameProduct;
        this.price = priceProduct;
        this.quantity = quantityProduct;
        this.category = categoryProduct;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}
