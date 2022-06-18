import java.util.Scanner;



// Мне помог один из учеников, но у меня проблема с выводом месячных отчетов, я создал классы для хранения данных, но с месячным отчетом не работает помогите пожалуйста

public class Main {

    public static Reader reader = new Reader();
    public static Comparison comparison = new Comparison();

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            printMenu();
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                reader.readMonth();

            } else if (userInput == 2) {
                reader.readYear();

            } else if (userInput == 3) {
                comparison.comparison(reader.monthsList, reader.monthMemories, reader.yearMemory);
                break;
            } else if (userInput == 4) {
                ShowMonth.showMonth(reader.monthsList, reader.monthMemories);
                break;

            } else if (userInput == 5) {
                ShowYear.showYear(reader.monthsList, reader.yearMemory.currentYear, reader.yearMemory.incomeList, reader.yearMemory.expensesList);
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