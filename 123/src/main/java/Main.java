public class Main {

    private static Text getText = new Text();
    private static PrintText printText = new PrintText();

    public static void main(String[] args){
        text();


    }

    private static void text(){
        System.out.println("Введите ИМЯ: \n");
        String text =getText.text();
        if (text.contains("1") ){
            printText.printText(text);
        } else {
            System.out.println("Вы не ввели ИМЯ\n");
            text();
        }
    }

}
