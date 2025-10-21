package avenga_interview;

import java.time.LocalDate;
import java.util.List;


public class Order {


    private String orderId;
    private String customerId;
    private List<OrderItem> items;
    private LocalDate orderDate;

    public Order(LocalDate orderDate, List<OrderItem> items, String customerId, String orderId) {
        this.orderDate = orderDate;
        this.items = items;
        this.customerId = customerId;
        this.orderId = orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
            "orderDate=" + orderDate +
            ", items=" + items +
            ", customerId='" + customerId + '\'' +
            ", orderId='" + orderId + '\'' +
            '}';
    }
}