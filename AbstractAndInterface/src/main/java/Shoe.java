abstract class Shoe {
    private String color;
    private String size;

    Shoe(String c, String s) {
        color = c;
        size = s;
    }

    abstract String getName();

    String getColor() {
        return color;
    }

    String getSize() {
        return size;
    }
}
