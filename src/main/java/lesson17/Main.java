package lesson17;

public class Main {
    public static void main(String[] args){

        Printer printer = new Printer();
        CarRegister carRegister = new CarRegister();



        // printer.scnnFile("test.txt");
        // printer.copyFile("testcopy1.txt","testcopy.txt");
       //  printer.countWord("test.txt");
        carRegister.registerCar(new Car("abc123","red","bensine", 2017,10));
        carRegister.printRegistredCars("Car_register.txt");




    }
}
