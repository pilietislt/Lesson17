package lesson17;

import java.io.Serializable;

public class Car implements Serializable {

    private String number, color, fueltype;
    private int year, mileage;

    public Car(String number,String color,String fueltype,int year, int mileage) {
        this.number = number;
        this.color = color;
        this.fueltype = fueltype;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", fueltype='" + fueltype + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
