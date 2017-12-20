package lesson17;

import java.io.*;

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

    void copyFile(String newFileName, String copyFileName){

        try (
                BufferedWriter out = new BufferedWriter(new FileWriter(newFileName))
        ) {

            try (
                    BufferedReader in = new BufferedReader(new FileReader(copyFileName));
            ) {
                String line;
                while ((line = in.readLine()) != null) {
                    out.write(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }




        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
