package VoteExerciseMap.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> election = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] candidates = line.split(",");

                String name = candidates[0];
                int valorASomar = Integer.parseInt(candidates[1]);

                if (election.containsKey(name)) {
                    int valorAtual = election.get(name);
                    election.put(name, valorAtual + valorASomar);
                } else {
                    election.put(candidates[0], Integer.parseInt(candidates[1]));
                }

                line = br.readLine();

            }

            for (String key : election.keySet()) {
                System.out.println(key + ": " + election.get(key));
            }


        } catch (IOException error) {
            System.out.println("Error: " + error.getMessage());
        }

        sc.close();
    }
}
