package java_final;

public enum Fuel {
    GASOLINE,
    DIESEL;

    public static Fuel getFuel(String fu) {
        return switch (fu) {
            case "gasoline" -> GASOLINE;
            default -> DIESEL;
        };
    }

}
