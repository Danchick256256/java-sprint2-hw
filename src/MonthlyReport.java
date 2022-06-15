import java.util.ArrayList;

public class MonthlyReport {
    private ArrayList<MonthlyReportRecord> monthlyReportRecords = new ArrayList<>();

    public ArrayList<MonthlyReportRecord> getMonthlyReportRecords() {
        return monthlyReportRecords;
    }

    @Override
    public String toString() {
        return "MonthlyReport{" +
                "monthlyReportRecords" + monthlyReportRecords +
                "}";
    }
}
