import java.util.Map;


public class ShowMonth {

    public static void showMonth(Map<String, String> monthsList, MonthMemory[] monthMemories) {
        for (String monthNumber : monthsList.keySet()) {
            int monthIndex = (Integer.parseInt(monthNumber) - 1);
         
            int maxIncome = 0;
            int maxExpense = 0;
            
            String maxIncomeItem = null;
            String maxExpenseItem = null;

            for (String i : monthMemories[monthIndex].incomeList.keySet()) {
                int income = monthMemories[monthIndex].incomeList.get(i);

                if (maxIncome < income) {
                    maxIncome = income;
                    maxIncomeItem = i;
                }
            }
            for (String i : monthMemories[monthIndex].expensesList.keySet()) {
                int income = monthMemories[monthIndex].expensesList.get(i);

                if (maxExpense < income) {
                    maxExpense = income;
                    maxExpenseItem = i;
                }
            }
            System.out.println("Месяц: " + monthsList.get(monthNumber));
            System.out.println("Самый прибыльный товар: " + maxIncomeItem + " на сумму " + maxIncome);
            System.out.println("Самая большая трата: " + maxExpenseItem + " на сумму " + maxExpense);
            
        }
    }
    
}