package cse213.cement_factory.Maliha_2420913;

import java.io.Serializable;
import java.time.LocalDate;

public class Order implements Serializable {
    private int orderId, quantity, totalPrice;
    private static int idCounter = 100;
    private String dealerName, productType, deliveryStatus;
    private LocalDate orderDate;
    private String location;
    private boolean isPaid;

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

    public String getLocation() {
        return location;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Order.idCounter = idCounter;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setLocation(String location) {
        this.location = location;
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
                ", location='" + location + '\'' +
                ", isPaid=" + isPaid +
                '}';
    }

    public Order(int orderId, int quantity, int totalPrice, String dealerName, String productType, String deliveryStatus, LocalDate orderDate, String location, boolean isPaid) {
        this.orderId = idCounter++;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.dealerName = dealerName;
        this.productType = productType;
        this.deliveryStatus = deliveryStatus;
        this.orderDate = orderDate;
        this.location = location;
        this.isPaid = isPaid;
    }

    public Order( String productType, int quantity, String location){
        this.productType = productType;
        this.quantity = quantity;
        this.location = location;
    }
}
