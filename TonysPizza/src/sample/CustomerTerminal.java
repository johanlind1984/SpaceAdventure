package sample;

import java.util.ArrayList;

public class CustomerTerminal {

    private final Menu menu;
    private Order order;
    private int orderCount;
    private ArrayList<Pizza> pizzaInCart;
    private ArrayList<Extras> extrasInCart;

    public CustomerTerminal() {
        menu = new Menu();
        orderCount = 1;
        order = new Order();
        pizzaInCart = new ArrayList<>();
        extrasInCart = new ArrayList<>();
    }

    public boolean addExtraIngredientToPizza(Ingredient ingredientToAdd, Pizza pizzaToAddTo) {

        for (Pizza tempPizza : pizzaInCart) {
            if(tempPizza.equals(pizzaToAddTo)) {
                tempPizza.addExtraIngredient(ingredientToAdd);
                return true;
            }
        }

        return false;
    }

    public boolean removeIngredientFromPizza(Ingredient ingredientToRemove, Pizza pizzaToRemoveFrom){

        for (Pizza tempPizza : pizzaInCart) {
            if(tempPizza.equals(pizzaToRemoveFrom)) {
                tempPizza.removeIngredient(ingredientToRemove);
                return true;
            }
        }

        return false;
    }

    public void addPizzaToShoppingCart(Pizza pizzaToAddToCart) {
        pizzaInCart.add(new Pizza(pizzaToAddToCart.getName(), pizzaToAddToCart.getPrice(), pizzaToAddToCart.getIncludedIngredients()));
    }

    public boolean removePizzaFromShoppingCart(Pizza pizzaToRemoveFromCart) {
        if(pizzaInCart.contains(pizzaToRemoveFromCart)) {
            pizzaInCart.remove(pizzaToRemoveFromCart);
            return true;
        }

        return false;
    }

    public void addExtraToCart(Extras extraToAddToCart) {
        extrasInCart.add(extraToAddToCart);
    }

    public boolean removeExtraFromCart(Extras extraRemoveFromCart) {
        if(extrasInCart.contains(extraRemoveFromCart)) {
            extrasInCart.remove(extraRemoveFromCart);
            return true;
        }
        return false;
    }

    public boolean checkOutShoppingCart() {
        order.setExtrasInOrder(extrasInCart);
        order.setPizzasInOrder(pizzaInCart);
        order.setOrderNumber(getOrderCount());

        if (order.getTotalPrice() != 0) {
            if (HardwareCreditCardReader.requestPayment(2323223, order.getTotalPrice())) {
                return true;
            }
        }

        return false;
    }

    public Menu getMenu() {
        return menu;
    }

    public Order getOrder() {
        return order;
    }

    public int getOrderCount() {
        if(orderCount < 100) {
            return orderCount;
        } else {
            orderCount = 1;
            return orderCount;
        }

    }

    public ArrayList<Pizza> getPizzaInCart() {
        return pizzaInCart;
    }

    public ArrayList<Extras> getExtrasInCart() {
        return extrasInCart;
    }

    public void clearShoppingCartAndOrder() {
        order = new Order();
        pizzaInCart = new ArrayList<Pizza>();
        extrasInCart = new ArrayList<Extras>();
    }
}
