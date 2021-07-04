package Restaurant;

import Customer.Customer;
import Restaurant.Bill;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static Product.ReadProductToFile.readFile;

public class Restaurant {
    private String nameRestaurant;
    private String address;
    private String phoneNumber;
    private ArrayList<Bill> bills;
    private ArrayList<Table> tables;
    private ArrayList<Customer> customers;
    private Customer customer;
    private String nameStaff;

    private static final int MAX_NUMBER_OF_TABLES = 2;

    public Restaurant() {

    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public boolean isAnyTableBooked(){
        for(int i = 0; i < MAX_NUMBER_OF_TABLES; i++){
            if (tables.get(i).isOccupied() == true){
                return true;
            }
        }
        return false;
    }

    private int findTheEmptyTable(){
        for(int i = 0; i < MAX_NUMBER_OF_TABLES; i++){
            if(tables.get(i).isOccupied() == false){
                return i;
            }
        }
        return -1;
    }

    public void displayBookedTable(){
        for (int i = 0; i <MAX_NUMBER_OF_TABLES; i++){
            if(tables.get(i).isOccupied() == true){
                System.out.println("Table No. " + i + " is occupied");
            }
        }
    }

    public boolean isAllTableOccupied(){
        int isEmpty = findTheEmptyTable();
        if (isEmpty == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public void generateBill(int id){
        Customer customer = getCustomer(id);
        Bill newBill = new Bill(id, nameRestaurant, nameStaff, customer);
        bills.add(newBill);
        System.out.println("Total Amount:" + newBill.getTotalPrice());
    }

    public void Menu() throws IOException {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("Menu:");
        System.out.println("1. Kiem tra ban");
        System.out.println("2. Dat ban");
        System.out.println("3. Danh muc san pham");
        System.out.println("4. Bill");
        System.out.println("5. Thanh toan");


        while (true) {
            System.out.print("Enter your choice ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("So ban da dat:");
                    System.out.println("So ban trong:");
                case 2:
                    if (isAllTableOccupied()) {
                        System.out.println("The table is fully booked!!!");
                    } else {
                        displayBookedTable();
                    }
                case 3:
                    readFile("src\\Data\\ListProduct");
            }
        }
    }
}
