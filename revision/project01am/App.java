// task 2, 3, 4, 5

package revision.project01am;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    
    public static void main(String[] args) {

        if (args.length < 2){
            System.out.println("Specify a directory and file");
            System.exit(-1);
        }

        File dir = new File(args[0]);
        if (!dir.exists()) {
            // attempt to create the directory if it does not exist
            dir.mkdir();
        }

        File file = new File(dir + File.separator + args[1]);

        List<Product> productList = new ArrayList<>();

        // add the products
        productList.add(new Product(1L, "Mouse", "For click UI on screen", "Computer", 99.0f, new Date()));
        productList.add(new Product(2L, "Keyboard", "device that allows alphanumeric inputs", "Computer", 235.5f, new Date()));
        productList.add(new Product(3L, "15.6 inch monitor", "Extended display panel", "Computer", 157.5f, new Date()));
        productList.add(new Product(4L, "Huawei Pura 70 Ultra","Huawei phone", "Mobile", 900f, new Date()));
        productList.add(new Product(5L, "Huawei Mate 50 Pr", "Huawei phone", "Mobile", 1200.0f, new Date()));
        productList.add(new Product(6L, "iPhone 16 Pro", "Iphone", "Mobile", 2000.0f, new Date()));
        productList.add(new Product(7L, "iPhone 14 Pro", "Iphone", "Mobile", 1800.0f, new Date()));
    
        // filter the list
        // display mobile phones that are above 1500
        List<Product> filtered = productList.stream()
                                .filter(prod -> prod.getProdCat().equals("Mobile"))
                                .filter(prod -> prod.getPrice() > 1500.0f)
                                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
        
        try(FileWriter fw = new FileWriter(file)){
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product p : filtered){
                bw.write(p.toString());
                bw.newLine();
            }
            bw.flush();
            fw.close();
        } catch (IOException e){
            System.out.println("Error in writing to file: " + e.getMessage());
        }
    }

}
