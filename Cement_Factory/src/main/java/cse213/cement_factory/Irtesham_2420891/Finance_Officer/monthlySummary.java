package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import java.io.Serializable;

public class monthlySummary implements Serializable {
    private double totalExpense;
    private double totalRevenue;

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public monthlySummary(double totalExpense, double totalRevenue) {
        this.totalExpense = totalExpense;
        this.totalRevenue = totalRevenue;
    }
}
