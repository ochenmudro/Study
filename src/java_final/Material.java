package java_final;

public enum Material {
    VELOR,
    VELVETEEN,
    PLUSH,
    POLYESTER,
    TWEED;


    public static Material getMaterial(String mat) {
        return switch (mat) {
            case "velveteen" -> VELVETEEN;
            case "plush" -> PLUSH;
            case "polyester" -> POLYESTER;
            case "tweed" -> TWEED;
            default -> VELOR;
        };

    }
}
