package java_final;

import java.util.Objects;

public class Bus extends Auto implements Comparable<Bus> {
    private String name;
    private String color;
    private Fuel fuel;
    private int seats;
    private int doors;

    public Bus(String input) {
        try {
            String[] bus = input.split(",");
            setName(bus[0]);
            setColor(bus[1]);
            for (Fuel f : Fuel.values()) {
                if (bus[2].equals(f.getOneOfFuel()))
                    setFuel(f);
            }
            setSeats(Integer.parseInt(bus[3]));
            setDoors(Integer.parseInt(bus[4]));
        }catch (NullPointerException e){
            System.out.println("Wrong types of parameters!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void autoInfo() {
        System.out.println("Name: " + this.getName() + ", color: " + this.getColor() + ", fuel: " + this.getFuel() +
                ", number of seats: " + this.getSeats() + ", number of doors:" + this.getDoors());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return seats == bus.seats && doors == bus.doors && Objects.equals(name, bus.name) && Objects.equals(color, bus.color) && fuel == bus.fuel;
    }

    @Override
    public int compareTo(Bus bus) {
        int result = this.name.compareTo(bus.name);
        if (result == 0)
            return Integer.compare(this.fuel.compareTo(bus.fuel), 0);
        else return result;
    }
}
