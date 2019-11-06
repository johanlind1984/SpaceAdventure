package sample;

import java.util.ArrayList;

public class Order {
    int orderNumber;
    ArrayList<Pizza> pizzasInOrder;
    ArrayList<Extras> extrasInOrder;

    public Order() {
        this.orderNumber = -1;
        this.pizzasInOrder = new ArrayList<>();
        this.extrasInOrder = new ArrayList<>();
    }

    public double getTotalPrice() {
        double totalPriceOfCart = 0;
        for (Pizza tempPizza: pizzasInOrder) {
            totalPriceOfCart += tempPizza.getPrice();
        }
        return totalPriceOfCart;
    }

    public void setPizzasInOrder(ArrayList<Pizza> pizzasInOrder) {
        this.pizzasInOrder = pizzasInOrder;
    }

    public void setExtrasInOrder(ArrayList<Extras> extrasInOrder) {
        this.extrasInOrder = extrasInOrder;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
