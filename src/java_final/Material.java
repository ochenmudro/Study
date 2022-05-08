package java_final;

public enum Material {
    VELOR("velor"),
    VELVETEEN("velveteen"),
    PLUSH("plush"),
    POLYESTER("polyester"),
    TWEED("tweed");

    private final String material;

    Material(String material) {
        this.material = material;
    }

    public String getOneOfMaterial() {
        return material;
    }
}
