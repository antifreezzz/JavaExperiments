public class Boots implements Shoe {
    private String color;
    private String size;

    Boots(String c, String s){
        color = c;
        size = s;
    }

    @Override
    public String getName() {
        return "Ботинки";
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
