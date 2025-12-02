package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import java.time.LocalDate;

public class ProductionRecord {
    private LocalDate production_date;
    private int shift;
    private double amount_produced;
    private int efficiency_stats;
    private int target_production;


    public LocalDate getProduction_date() {
        return production_date;
    }

    public void setProduction_date(LocalDate production_date) {
        this.production_date = production_date;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getAmount_produced() {
        return amount_produced;
    }

    public void setAmount_produced(double amount_produced) {
        this.amount_produced = amount_produced;
    }

    public int getEfficiency_stats() {
        return efficiency_stats;
    }

    public void setEfficiency_stats(int efficiency_stats) {
        this.efficiency_stats = efficiency_stats;
    }

    public int getTarget_production() {
        return target_production;
    }

    public void setTarget_production(int target_production) {
        this.target_production = target_production;
    }

    public ProductionRecord(LocalDate production_date, int shift, double amount_produced, int efficiency_stats, int target_production) {
        this.production_date = production_date;
        this.shift = shift;
        this.amount_produced = amount_produced;
        this.efficiency_stats = efficiency_stats;
        this.target_production = target_production;
    }
}
