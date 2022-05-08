package java_final;

import java.util.Objects;

public class Car extends Auto implements Comparable<Car> {
    private String name;
    private String color;
    private Fuel fuel;
    private Material material;

    public Car(String input) {
        try {
            String[] car = input.split(",");
            setName(car[0]);
            setColor(car[1]);
            for (Material m : Material.values()) {
                if (car[2].equals(m.getOneOfMaterial()))
                    setMaterial(m);
            }
            for (Fuel f : Fuel.values()) {
                if (car[3].equals(f.getOneOfFuel()))
                    setFuel(f);
            }
        } catch (Exception e) {
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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void autoInfo() {
        System.out.println("Name: " + this.getName() + ", color: " + this.getColor() + ", material of seats: "
                + this.getMaterial().getOneOfMaterial() + ", fuel: " + this.getFuel().getOneOfFuel());
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
}














