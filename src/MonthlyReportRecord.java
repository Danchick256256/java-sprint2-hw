public class MonthlyReportRecord {


    String itemName;
    boolean isExpense;
    int quantity;
    int sumOfOne;

    public MonthlyReportRecord(String itemName, boolean isExpense, int quantity, int sumOfOne) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }

    @Override
    public String toString() {
        return "MonthlyReportRecord{" +
                "itemName='" + itemName + '\'' +
                ", isExpense=" + isExpense +
                ", quanity=" + quantity +
                ", sunOfOne=" + sumOfOne +
                "}";
    }

}
