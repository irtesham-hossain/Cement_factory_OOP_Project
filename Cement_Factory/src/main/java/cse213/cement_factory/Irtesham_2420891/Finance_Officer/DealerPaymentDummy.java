package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import java.io.Serializable;
import java.time.LocalDate;

public class DealerPaymentDummy implements Serializable {
    private String dealerName;
    private Double amountNotPaid,totalBill;
    private boolean isPaid;
    private LocalDate paidDate;

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public Double getAmountNotPaid() {
        return amountNotPaid;
    }

    public void setAmountNotPaid(Double amountNotPaid) {
        this.amountNotPaid = amountNotPaid;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = paidDate;
    }

    public DealerPaymentDummy(String dealerName, Double amountNotPaid, Double totalBill, boolean isPaid, LocalDate paidDate) {
        this.dealerName = dealerName;
        this.amountNotPaid = amountNotPaid;
        this.totalBill = totalBill;
        this.isPaid = isPaid;
        this.paidDate = paidDate;
    }
}
