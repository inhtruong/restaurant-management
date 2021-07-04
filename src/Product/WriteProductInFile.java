package Product;

import Product.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteProductInFile {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "ID || Name || Price || Category";

    private static ArrayList<Product> products;

    public static ArrayList<Product> listProduct() {
        products = new ArrayList<Product>();
        products.add(new Product("Pizza", 500000, 50, "Do an"));
        products.add(new Product("Ga ran", 30000, 24, "Do an"));
        products.add(new Product("Cafe", 12000, 40,"Do uong"));

        return products;
    }


    public static void writeFile() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        listProduct();

        try {
            fw = new FileWriter("src\\Data\\List_Product.txt");
            bw = new BufferedWriter(fw);

            bw.append(FILE_HEADER);
            bw.append(NEW_LINE_SEPARATOR);
            for (Product value : products) {
                bw.append((char) value.getID());
                bw.append(COMMA_DELIMITER);
                bw.append(value.getName());
                bw.append(COMMA_DELIMITER);
                bw.append((char) value.getPrice());
                bw.append(COMMA_DELIMITER);
                bw.append(value.getCategory());
            }
            bw.append(NEW_LINE_SEPARATOR);

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
