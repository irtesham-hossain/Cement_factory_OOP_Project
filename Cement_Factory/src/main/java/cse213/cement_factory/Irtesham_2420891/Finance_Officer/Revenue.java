package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import java.io.Serializable;
import java.time.LocalDate;

public class Revenue implements Serializable {
    private  LocalDate revmonth;
    private double revAMount;

    public Revenue(LocalDate month, double revAMount) {
        this.revmonth = month;
        this.revAMount = revAMount;
    }

    public LocalDate getRevmonth() {
        return revmonth;
    }

    public void setRevmonth(LocalDate revmonth) {
        this.revmonth = revmonth;
    }

    public double getRevAMount() {
        return revAMount;
    }

    public void setRevAMount(double revAMount) {
        this.revAMount = revAMount;
    }
}
