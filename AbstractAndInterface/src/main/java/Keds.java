public class Keds implements Shoe {
    private String color;
    private String size;

    Keds(String c, String s){
        color = c;
        size = s;
    }

    @Override
    public String getName() {
        return "Кеды";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSize() {
        return size;
    }
}
