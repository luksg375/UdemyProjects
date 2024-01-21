package ManipulationFileExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Windows\\Temp\\in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            String line = br.readLine();
            System.out.println(line);
            String[] line1 = line.split(",", 3);
            for (String line2 : line1) {
                System.out.println(line2);

            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
