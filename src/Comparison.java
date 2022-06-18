import java.util.Map;
import java.util.ArrayList;


public class Comparison {
    public void comparison (Map<String, String> monthsList, MonthMemory[] monthMemories, YearMemory yearMemory) {

        ArrayList<String> wrongMonth = new ArrayList<String>();

        for (String monthNumber : monthsList.keySet()) {
            int monthIndex = (Integer.parseInt(monthNumber) - 1);
            String monthName = monthsList.get(monthNumber);

            int income = 0;

            for (String i : monthMemories[monthIndex].incomeList.keySet()) {
                income += monthMemories[monthIndex].incomeList.get(i);
            }

            int expense = 0;

            for (String i : monthMemories[monthIndex].expensesList.keySet()) {
                expense += monthMemories[monthIndex].expensesList.get(i);
            }

            if (income == yearMemory.incomeList.get(monthName) && expense == yearMemory.expensesList.get(monthName)) {
                ;
            } else {
                wrongMonth.add(monthName);
            }
        }

        if (wrongMonth.isEmpty()) {
            System.out.println("Разногласий нет");
        } else {
            System.out.println("Неправильные месяца :" + wrongMonth);
        }
    }
}
