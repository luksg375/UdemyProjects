package ManipulationFileExercise;

import ManipulationFileExercise.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products =  new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {



            String line = br.readLine();

            while (line != null) {
                String[] lineSplit = line.split(",");
                String name = lineSplit[0];
                double price = Double.parseDouble(lineSplit[1]);
                int quantity = Integer.parseInt(lineSplit[2]);

                products.add(new Product(name, price, quantity));

                line = br.readLine();

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter()))

        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
