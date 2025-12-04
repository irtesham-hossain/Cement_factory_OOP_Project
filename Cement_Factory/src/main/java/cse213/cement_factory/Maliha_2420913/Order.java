package cse213.cement_factory.Maliha_2420913;

import java.time.LocalDate;

public class Order {
    private int orderId, quantity, totalPrice;
    private String dealerName, productType, deliveryStatus;
    private LocalDate orderDate;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", dealerName='" + dealerName + '\'' +
                ", productType='" + productType + '\'' +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }

    public Order(int orderId, int quantity, int totalPrice, String dealerName, String productType, String deliveryStatus, LocalDate orderDate) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.dealerName = dealerName;
        this.productType = productType;
        this.deliveryStatus = deliveryStatus;
        this.orderDate = orderDate;
    }
}
