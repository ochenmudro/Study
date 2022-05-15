package java_final;

import java.util.Objects;

public class Car extends Auto implements Comparable<Car> {
    private String name;
    private String color;
    private Fuel fuel;
    private Material material;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public void autoInfo() {
        System.out.println("Name: " + this.getName() + ", color: " + this.getColor() + ", material of seats: "
                + this.getMaterial() + ", fuel: " + this.getFuel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(this.name, car.name) && Objects.equals(this.color, car.color) && this.fuel == car.fuel
                && this.material == car.material;
    }

    @Override
    public int compareTo(Car car) {
        int result = this.name.compareTo(car.name);
        if (result == 0)
            return Integer.compare(this.fuel.compareTo(car.fuel), 0);
        else return result;
    }

    public static CarBuilder carBuilder() {
        return new Car().new CarBuilder();
    }

    public class CarBuilder {
        private CarBuilder() {
        }

        public CarBuilder setName(String name) {
            Car.this.name = name;
            return this;
        }

        public CarBuilder setColor(String color) {
            Car.this.color = color;
            return this;
        }

        public CarBuilder setMaterial(String material) {
            Car.this.material = Material.getMaterial(material);
            return this;
        }

        public CarBuilder setFuel(String fuel) {
            Car.this.fuel = Fuel.getFuel(fuel);
            return this;
        }

        public Car build() {
            return Car.this;
        }
    }
}














