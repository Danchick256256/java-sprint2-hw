import java.util.Scanner;


public class Main {

    public static Reader reader = new Reader();
    public static ShowMonth showMonth = new ShowMonth();
    public static ShowYear showYear = new ShowYear();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            printMenu();
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                reader.readMonth();
                break;

            } else if (userInput == 2) {
                reader.readYear();
                break;

            } else if (userInput == 3) {
                break;
                // не понимаю как реализовать этот метод
            } else if (userInput == 4) {
                ShowMonth.showMonth();
                break;

            } else if (userInput == 5) {
                ShowYear.showYear();
                break;

            } else {
                break;
            }
        }
        System.out.println("Выход.");
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о всех месячных отчётах");
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("0 - Выйти из приложения");
    }


}