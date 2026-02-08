package Test;

import java.io.*;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Main {
    static void main(String[] args) {

        String file = ("C:\\Users\\saulo\\OneDrive\\Desktop\\out.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            Set<LogUser> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" ");
                String name = fields[0];
                Date date = Date.from(Instant.parse(fields[1]));

                set.add(new LogUser(name, date));

                line = br.readLine();

            }

            System.out.println("Total Users: " + set.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
