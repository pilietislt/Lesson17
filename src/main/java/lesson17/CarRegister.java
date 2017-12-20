package lesson17;

import java.io.*;

public class CarRegister {

    void registerCar(Car car){
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Car_register.txt"));
        ) {

            out.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
