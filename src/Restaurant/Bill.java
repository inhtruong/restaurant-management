package Restaurant;

import Customer.Customer;
import Order.ProductOrder;

import java.util.Iterator;

public class Bill {
    private int billID;
    private String nameRestaurant;
    private String nameStaff;

    private Customer customer;

    public Bill() {

    }

    public Bill(int billID, String nameRestaurant, String nameStaff, Customer customer) {
        this.billID = billID;
        this.nameRestaurant = nameRestaurant;
        this.nameStaff = nameStaff;
        this.customer = customer;
    }

    public Bill(int id, Customer customer) {

    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        Iterator<ProductOrder> po =  customer.getOrder().getProductOrders().iterator();
        while (po.hasNext() == true) {
            ProductOrder el = po.next();
            totalPrice += (el.getProduct().getPrice())*(el.getNumberOfPlase());
        }
        return totalPrice;
    }




    @Override
    public String toString() {
        return "Bill{" +
                "billID=" + billID +
                ", nameRestaurant='" + nameRestaurant + '\'' +
                ", nameStaff='" + nameStaff + '\'' +
                ", customer=" + customer +
                '}';
    }
}
