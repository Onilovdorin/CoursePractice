package lesson12.homework.ex1;

public class Customer {
    private final double minCost = 2.0;
    private final double additionalCost = 0.5;
    private final double maxCost = 10;
    private int parkedHours;
    private double clientCharge;
    private static double totalProfit;

    public void setParkedHours(int parkedHours) {
        this.parkedHours = parkedHours;
    }

    public double getClientCharge() {
        return clientCharge;
    }

    public static double getTotalProfit() {
        return totalProfit;
    }

    public void calculateCharges() {
        if (parkedHours == 24) {
            clientCharge = maxCost;
        } else if (parkedHours >= 1 && parkedHours <= 3) {
            clientCharge = minCost;
        } else if (parkedHours > 3 && parkedHours < 24) {
            int additionalHours = parkedHours - 3;
            clientCharge = additionalHours * additionalCost + minCost;
        }
    }

    public static double calculateTotalProfit(Customer[] clients) {
        double totalProfit = 0;
        for (Customer client : clients) {
            totalProfit += client.clientCharge;
        }
        return totalProfit;
    }
}
