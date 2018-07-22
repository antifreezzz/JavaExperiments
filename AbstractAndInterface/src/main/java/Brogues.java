public class Brogues implements Shoe {
    private String color;
    private String size;

    Brogues(String c, String s){
        color = c;
        size = s;
    }


    @Override
    public String getName() {
        return "Броги";
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
