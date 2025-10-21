package avenga_interview;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Orders {

    List<Order> orders = new ArrayList<>();

    @Override
    public String toString() {
        return "Orders{" +
            "orders=" + orders +
            '}';
    }

    public Orders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    // Zwróć wszystkie zamówienia złożone w ostatnich 30 dniach.
    public List<Order> returnItemsFromLa0stNDays(int n) {
        n++;
        int finalN = n;
        return
            this.orders.stream()
                .filter(
                    o -> LocalDate.now().minusDays(finalN).isBefore(o.getOrderDate())
                ).toList();
    }


    //    Dla każdego zamówienia policz jego łączną wartość (sum(quantity * pricePerUnit)).
    public Map<String, Double> countSum() {
        return orders.stream()
            .collect(Collectors.toMap(Order::getOrderId, o ->
                o.getItems().stream().mapToDouble(item -> {
                    return item.getQuantity() * item.getPricePerUnit();
                }).sum()
            ));
    }


    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        OrderItem orderItemO1_1 = new OrderItem("a", "c1", 2, 1d);
        OrderItem orderItemO1_2 = new OrderItem("b", "c1", 2, 2d);
        OrderItem orderItemO1_3 = new OrderItem("c", "c2", 2, 3d);

        List<OrderItem> orderItems = Arrays.asList(orderItemO1_1, orderItemO1_2, orderItemO1_3);

        Order order = new Order(LocalDate.now().minusDays(30), orderItems, "c_1", "o_1");

        orders.add(order);

        OrderItem orderItemO2_1 = new OrderItem("a", "c1", 2, 4d);
        OrderItem orderItemO2_2 = new OrderItem("b", "c1", 2, 5d);
        OrderItem orderItemO2_3 = new OrderItem("c", "c2", 2, 6d);

        List<OrderItem> orderItems2 = Arrays.asList(orderItemO2_1, orderItemO2_2, orderItemO2_3);

        Order order2 = new Order(LocalDate.now().minusDays(30), orderItems2, "c_2", "o_2");

        orders.add(order2);

        Orders ordersObj = new Orders(orders);

        var result = ordersObj.returnItemsFromLa0stNDays(30);

        System.out.println(result);

        Map<String, Double> result2 = ordersObj.countSum();

        System.out.println(result2);
    }
}
