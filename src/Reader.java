import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;


public class Reader {
    public YearMemory yearMemory;
    public MonthMemory[] monthMemories = new MonthMemory[3];

    private final String currentYear = "2021";
    public Map<String, String> monthsList = new HashMap<>();

    Reader() {
        monthsList.put("01", "Январь");
        monthsList.put("02", "Февраль");
        monthsList.put("03", "Март");
    }

    public void readMonth() {
        int reportsCount = 0;

        for (String monthNumber : monthsList.keySet()) {

            Path filePath = Path.of("resources/" + "m." + currentYear + monthNumber + ".csv"); // creating file path

            if (Files.exists(filePath)) { // checking file exists
                try {
                    String rawData = Files.readString(filePath); // read file
                    String[] lines = rawData.split("\\n"); // splitting lines
                    Map<String, Integer> incomeList = new HashMap<>(); // creating income hashmap
                    Map<String, Integer> expensesList = new HashMap<>(); // creating expenses hashmap

                    for (int i = 1; i < lines.length; i++) { // checking lines
                        String[] linesContent = lines[i].split(","); // splitting lines
                        String itemName = linesContent[0]; // getting name
                        int itemSum = Integer.parseInt(linesContent[2]) * Integer.parseInt(linesContent[3]);

                        if (linesContent[1].equalsIgnoreCase("false")) { // parsing type of expenses
                            incomeList.put(itemName, itemSum);
                        } else {
                            expensesList.put(itemName, itemSum);
                        }
                    }
                    monthMemories[Integer.parseInt(monthNumber) - 1] = new MonthMemory(monthsList.get(monthNumber), incomeList, expensesList); // creating class for show statistic
                    reportsCount++;

                } catch (IOException e) {
                    System.out.println("Не найден файл отчета " + "m." + currentYear + monthNumber + ".csv !");
                }
            }
        }
        System.out.println("Обработано месячных отчетов: " + reportsCount);
    }

    public void readYear() {
        Map<String, Integer> incomeList = new HashMap<>();
        Map<String, Integer> expensesList = new HashMap<>();
        Path filePath = Path.of("resources/" + "y." + currentYear + ".csv");
        try {
            String rawData = Files.readString(filePath);

            String[] lines = rawData.split("\\n");

            for (int i = 1; i < lines.length; i++) {
                String[] linesContent = lines[i].split(",");
                String monthNumber = linesContent[0];
                int monthSum = Integer.parseInt(linesContent[1]);

                if (linesContent[2].equalsIgnoreCase("false")) {
                    incomeList.put(monthsList.get(monthNumber), monthSum);
                } else {
                    expensesList.put(monthsList.get(monthNumber), monthSum);
                }
            }
            yearMemory = new YearMemory(currentYear, incomeList, expensesList); // creating class for showing year stat
            System.out.println("Годовой отчет успешно считан!");

        } catch (IOException e) {
            System.out.println("Не найден файл " + "y." + currentYear + ".csv");
        }
    }
}