package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import java.io.Serializable;
import java.time.LocalDate;

public class Revenue implements Serializable {
    private  LocalDate month;
    private double revAMount;

    public Revenue(LocalDate month, double revAMount) {
        this.month = month;
        this.revAMount = revAMount;
    }

    public LocalDate getMonth() {
        return month;
    }

    public void setMonth(LocalDate month) {
        this.month = month;
    }

    public double getRevAMount() {
        return revAMount;
    }

    public void setRevAMount(double revAMount) {
        this.revAMount = revAMount;
    }
}
