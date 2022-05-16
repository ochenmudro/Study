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
        String input1;
        String input2;
        try {
            input1 = Files.readString(Paths.get(fileName1));
            input2 = Files.readString(Paths.get(fileName2));
        } catch (NoSuchFileException e) {
            System.out.println("File does not exist!");
            return;
        }
        List<Car> carList = new LinkedList<>();
        String[] cars = input1.split(";");
        for (String str : cars) {
            String[] inputs = str.split(",");
            Car car = Car.carBuilder().setName(inputs[0]).setColor(inputs[1]).setMaterial(inputs[2]).setFuel(inputs[3]).build();
            carList.add(car);
        }

        List<Bus> busList = new LinkedList<>();
        String[] buses = input2.split(";");
        for (String str : buses) {
            String[] inputsB = str.split(",");
            Bus bus = Bus.busBuilder().setName(inputsB[0]).setColor(inputsB[1]).setFuel(inputsB[2]).setSeats(inputsB[3])
                    .setDoors(inputsB[4]).build();
            busList.add(bus);
        }

        Parameterized.info(carList);
        Parameterized.info(busList);

        Parameterized.amountOfThis(carList.get(4), carList);
        Parameterized.amountOfThis(busList.get(1), busList);

        boolean binCar = Parameterized.binarySearch(Car.carBuilder().setName("Lada").setColor("Black").setMaterial("Plush")
                .setFuel("Diesel").build(), carList);
        if (binCar) {
            System.out.println("element exist");
        } else {
            System.out.println("element does not exist");
        }
        Parameterized.max(carList);

        boolean binBus = Parameterized.binarySearch(busList.get(2), busList);
        if (binBus) {
            System.out.println("element exist");
        } else {
            System.out.println("element does not exist");
        }
        Parameterized.max(busList);

    }
}

