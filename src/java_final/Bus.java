package java_final;

import java.util.Objects;

public class Bus extends Auto implements Comparable<Bus> {
    private String name;
    private String color;
    private Fuel fuel;
    private int seats;
    private int doors;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
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

    public static Bus.BusBuilder busBuilder() {
        return new Bus().new BusBuilder();
    }

    public class BusBuilder {
        private BusBuilder() {
        }

        public Bus.BusBuilder setName(String name) {
            Bus.this.name = name;
            return this;
        }

        public Bus.BusBuilder setColor(String color) {
            Bus.this.color = color;
            return this;
        }

        public Bus.BusBuilder setFuel(String fuel) {
            Bus.this.fuel = Fuel.getFuel(fuel);
            return this;
        }

        public Bus.BusBuilder setSeats(String seats) {
            Bus.this.seats = Integer.parseInt(seats);
            return this;
        }

        public Bus.BusBuilder setDoors(String doors) {
            Bus.this.doors = Integer.parseInt(doors);
            return this;
        }

        public Bus build() {
            return Bus.this;
        }
    }
}
