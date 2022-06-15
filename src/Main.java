public class Main {

    public static void main(String[] args) {
        SimpleFileReader simpleFileReader = new SimpleFileReader();

        String content = simpleFileReader.readFileContentsOrNull("src/main/resources/m.2021.csv");

        String[] lines = content.split(System.lineSeparator());

        for (int i = 1; i < lines.length; i++) {
            String[] parts = lines[i].split(",");
            String itemName = parts[0];
            boolean isExpense = Boolean.parseBoolean(parts[1]);
            int quantity = Integer.parseInt(parts[2]);
            int sunOfOne = Integer.parseInt(parts[3]);

            MonthlyReportRecord record = new MonthlyReportRecord(itemName, isExpense, quantity, sunOfOne);


        }

        MonthlyReport monthlyReport = new MonthlyReport();

        for (MonthlyReportRecord monthlyReportRecord : monthlyReport.getMonthlyReportRecords()) {
            System.out.println(monthlyReportRecord);
        }
    }
}