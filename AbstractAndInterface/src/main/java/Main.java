import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Shoe> shoes = new ArrayList<>();
        shoes.add(new Boots("Black", "44"));
        shoes.add(new Brogues("White", "43"));
        shoes.add(new Keds("Blue", "28"));

        printShoes(shoes);
    }

    private static void printShoes(ArrayList<Shoe> shoes){
        for (Shoe shoe: shoes){
            System.out.println("Name: " + shoe.getName());
            System.out.println("Color: " + shoe.getColor());
            System.out.println("Size: " + shoe.getSize());
            System.out.println("\n");
        }
    }
}
