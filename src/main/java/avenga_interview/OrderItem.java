package avenga_interview;

public class OrderItem {
     private String productName;
     private String category;
     private int quantity;
     private double pricePerUnit;

    public String getProductName() {
        return productName;
    }

    public OrderItem(String productName, String category, int quantity, double pricePerUnit) {
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
            "productName='" + productName + '\'' +
            ", category='" + category + '\'' +
            ", quantity=" + quantity +
            ", pricePerUnit=" + pricePerUnit +
            '}';
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
