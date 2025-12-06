package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import java.io.Serializable;
import java.time.LocalDate;

public class Expense implements Serializable {
    private LocalDate expense_date;
    private String expense_type;
    private double amount;

    public LocalDate getExpense_date() {
        return expense_date;
    }

    public void setExpense_date(LocalDate expense_date) {
        this.expense_date = expense_date;
    }

    public String getExpense_type() {
        return expense_type;
    }

    public void setExpense_type(String expense_type) {
        this.expense_type = expense_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Expense(LocalDate expense_date, String expense_type, double amount) {
        this.expense_date = expense_date;
        this.expense_type = expense_type;
        this.amount = amount;
    }
}
