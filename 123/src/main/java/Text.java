import java.util.Scanner;

class Text implements PrintInterface{
    private Scanner in = new Scanner(System.in);
    private PrintText printText = new PrintText();

    String text(){
        return in.next();
    }

    @Override
    public void textIn(){
        System.out.println("Введите ИМЯ: \n");
        String text = text();
        if (text.contains("1") ){
            printText.printText(text);
        } else {
            System.out.println("Вы не ввели ИМЯ\n");
            text();
        }
    }
}
