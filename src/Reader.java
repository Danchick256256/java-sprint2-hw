import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;


public class Reader {
    private final String currentYear = "2021";
    public Map<String, String> monthsList = new HashMap<>();

    Reader() {
        monthsList.put("01", "Январь");
        monthsList.put("02", "Февраль");
        monthsList.put("03", "Март");
        monthsList.put("04", "Апрель");
        monthsList.put("05", "Май");
        monthsList.put("06", "Июнь");
        monthsList.put("07", "Июль");
        monthsList.put("08", "Август");
        monthsList.put("09", "Сентябрь");
        monthsList.put("10", "Октябрь");
        monthsList.put("11", "Ноябрь");
        monthsList.put("12", "Декабрь");
    }

    public void readMonth() {
        int reportsCount = 0;

        for (String monthNumber : monthsList.keySet()) {
            Path filePath = Path.of("./resources/" + "m." + currentYear + monthNumber + ".csv");
            if (Files.exists(filePath)) {
                try {
                    String rawData = Files.readString(filePath);
                    // how to split lines :(

                } catch (IOException e) {
                    System.out.println("Не найден файл " + "m." + currentYear + monthNumber + ".csv");
                }
            }
        }
        System.out.println("Обработано месячных отчетов: " + reportsCount);
    }

    public void readYear() {
        Path filePath = Path.of("./resources/" + "y." + currentYear + ".csv");
        try {
            String rawData = Files.readString(filePath);
            // how to split lines :(

        } catch (IOException e) {
            System.out.println("Не найден файл " + "y." + currentYear + ".csv");
        }
    }
}