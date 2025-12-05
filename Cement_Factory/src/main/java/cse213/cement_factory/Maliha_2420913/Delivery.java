package cse213.cement_factory.Maliha_2420913;

import java.time.LocalDate;

public class Delivery {
    private int deliveryId, orderId;
    String deliveryStatus;
    LocalDate expectedDeliveryDate;

    public Delivery(int deliveryId, int orderId, String deliveryStatus, LocalDate expectedDeliveryDate) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocalDate getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", orderId=" + orderId +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", expectedDeliveryDate=" + expectedDeliveryDate +
                '}';
    }
}
