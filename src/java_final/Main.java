package java_final;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName1 = "F:\\java\\cmdApp\\src\\java_final\\input1.txt";
        String fileName2 = "F:\\java\\cmdApp\\src\\java_final\\input2.txt";
        try {
            String input1 = Files.readString(Paths.get(fileName1));
            String input2 = Files.readString(Paths.get(fileName2));
            List<Car> carList = new LinkedList<>();
            String[] cars = input1.split(";");
            for (String str : cars) {
                carList.add(new Car(str));
            }

            List<Bus> busList = new LinkedList<>();
            String[] buses = input2.split(";");
            for (String str : buses) {
                busList.add(new Bus(str));
            }

            Parameterized.info(carList);
            Parameterized.info(busList);

            Parameterized.amountOfThis(carList.get(4), carList);
            Parameterized.amountOfThis(busList.get(1), busList);

            Parameterized.binarySearch(new Car("Lada,black,tweed,gasoline"), carList);
            Parameterized.max(carList);

            Parameterized.binarySearch(busList.get(2), busList);
            Parameterized.max(busList);
        } catch (NoSuchFileException e) {
            System.out.println("File does not exist!");
        }
    }
}

