package cse213.cement_factory.Maliha_2420913;

public class Product {
    private String productName;
    private int productId;
    private double unitPrice;

    public Product(String productName, int productId, double unitPrice) {
        this.productName = productName;
        this.productId = productId;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
