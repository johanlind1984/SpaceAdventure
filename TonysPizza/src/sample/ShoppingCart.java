package sample;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Pizza> pizzasInCart;

    public ShoppingCart(ArrayList<Pizza> pizzasInCart) {
        this.pizzasInCart = pizzasInCart;
    }

    public double getTotalPrice() {
        double totalPriceOfCart = 0;
        for (Pizza tempPizza: pizzasInCart) {
            totalPriceOfCart += tempPizza.getPrice();
        }
        return totalPriceOfCart;
    }

    public void addPizzaToCart(Pizza pizzaToAdd) {
        pizzasInCart.add(pizzaToAdd);
    }

    public boolean removePizzaFromCart(Pizza pizzaToRemove) {
        if(pizzasInCart.contains(pizzaToRemove)) {
            pizzasInCart.remove(pizzaToRemove);
            return true;
        }
        return false;
    }

    public boolean checkOutCart() {
        if(HardwareCreditCardReader.requestSwipe()) {
            if(HardwareCreditCardReader.requestPayment(HardwareCreditCardReader.getCC(), getTotalPrice())) {
                return true;
            } else {
               return false;
            }
        } else {
           return false;
        }
    }
}
