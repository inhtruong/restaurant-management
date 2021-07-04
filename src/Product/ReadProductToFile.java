package Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static Product.WriteProductInFile.writeFile;

public class ReadProductToFile {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "ID || Name || Price || Category";

    public static void readFile(String path) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            int c;
            while ((c = br.read()) != -1) {
                writeFile();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
