package lesson17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Printer {

    void scnnFile(String fileName){

        try (
                BufferedReader in = new BufferedReader(new FileReader(fileName));
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
