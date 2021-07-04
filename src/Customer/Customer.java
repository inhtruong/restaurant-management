package Customer;

import Order.Order;
import Order.ProductOrder;
import Product.Product;

public class Customer {
    private int customerID;
    private String name;
    private Order order;

    public Customer() {

    }

    public Customer(int customerID) {
        this.customerID = customerID;
        order = new Order(customerID);

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void giveOrder(Product product, int numberOfPlates){



        ProductOrder newItemOrder = new ProductOrder(product, numberOfPlates);

        order.addOrder(newItemOrder);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", order=" + order +
                '}';
    }


}
