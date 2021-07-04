package Order;

import Product.Product;

import java.util.ArrayList;

public class Order {
    private int orderID;
    private ArrayList<ProductOrder> productOrders = new ArrayList<ProductOrder>();

    public Order() {
        orderID = 0;
        productOrders = null;
    }

    public Order(int orderID, ArrayList<ProductOrder> productOrders) {
        this.orderID = orderID;
        this.productOrders = productOrders;
    }

    public Order(int orderID) {
        this.orderID = orderID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public ArrayList<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(ArrayList<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }

    public void addOrder(ProductOrder productOrder) {
        productOrders.add(productOrder);
    }
}
