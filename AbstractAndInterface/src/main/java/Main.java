import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Shoe> shoes = new ArrayList<>();
        shoes.add(new Boots("Чёрный", "44"));
        shoes.add(new Brogues("Белый", "43"));
        shoes.add(new Keds("Синий", "28"));

        printShoes(shoes);
    }

    private static void printShoes(ArrayList<Shoe> shoes){
        for (Shoe shoe: shoes){
            System.out.println("Name: " + shoe.getName());
            System.out.println("Color: " + shoe.getColor());
            System.out.println("Size: " + shoe.getSize());
        }
    }
}
