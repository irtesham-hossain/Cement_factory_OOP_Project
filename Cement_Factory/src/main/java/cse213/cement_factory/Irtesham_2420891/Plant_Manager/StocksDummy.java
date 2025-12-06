package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import java.io.Serializable;
import java.time.LocalDate;

public class StocksDummy implements Serializable {
    private int limeStone,gypsum;
    private LocalDate stockDate;

    public StocksDummy(int limeStone, int gypsum, LocalDate stockDate) {
        this.limeStone = limeStone;
        this.gypsum = gypsum;

        this.stockDate = stockDate;
    }

    public int getLimeStone() {
        return limeStone;
    }

    public void setLimeStone(int limeStone) {
        this.limeStone = limeStone;
    }

    public int getGypsum() {
        return gypsum;
    }

    public void setGypsum(int gypsum) {
        this.gypsum = gypsum;
    }



    public LocalDate getStockDate() {
        return stockDate;
    }

    public void setStockDate(LocalDate stockDate) {
        this.stockDate = stockDate;
    }

    @Override
    public String toString() {
        return "StocksDummy{" +
                "gypsum=" + gypsum +
                ", limeStone=" + limeStone +
                '}';
    }
}
