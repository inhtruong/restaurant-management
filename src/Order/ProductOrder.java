package Order;

import Product.Product;

public class ProductOrder {
    private Product product;
    private int numberOfPlase;

    public ProductOrder() {
        product = null;
        numberOfPlase = 0;
    }

    public ProductOrder(Product product, int numberOfPlase) {
        this.product = product;
        this.numberOfPlase = numberOfPlase;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberOfPlase() {
        return numberOfPlase;
    }

    public void setNumberOfPlase(int numberOfPlase) {
        this.numberOfPlase = numberOfPlase;
    }
}
