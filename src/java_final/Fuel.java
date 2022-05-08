package java_final;

public enum Fuel {
    GASOLINE("gasoline"),
    DIESEL("diesel");
    private final String fuel;

    Fuel(String fuel) {
        this.fuel = fuel;
    }

    public String getOneOfFuel() {
        return fuel;
    }
}
