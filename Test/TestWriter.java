package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Hello", "World", "Link"};
        String path = "C:\\Users\\saulo\\OneDrive\\Desktop\\out.txt";

        try (BufferedWriter br = new BufferedWriter (new FileWriter(path))){

            for(String line : lines){
                br.write(line);
                br.newLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
