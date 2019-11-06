package sample;

import java.util.LinkedList;
import java.util.Queue;

public class ChefTerminal {

    private String name;
    private Queue<Pizza> queueOfPizzasToBake;

    // CONSIDER USING A ENUM INSTEAD OF CONSTANTS IN CLASS
    private static final int ORDER_NOT_TAKEN = 0;
    private static final int ORDER_IS_PROCESSING = 1;
    private static final int ORDER_IS_DONE = 2;

    public ChefTerminal(String name) {
        this.name = name;
        this.queueOfPizzasToBake = new LinkedList<>();
    }

    public void addPizzaToBakeQueue(Pizza pizzaToBake) {
        queueOfPizzasToBake.add(pizzaToBake);
    }

    public boolean removePizzaFromBakeQueue(Pizza pizzaToRemove) {
        // TESTED
        if(queueOfPizzasToBake.contains(pizzaToRemove)) {
            queueOfPizzasToBake.remove(pizzaToRemove);
            return true;
        }

        return false;
    }

    private void startOrder(Pizza pizza) {
        pizza.setOrderStatus(ORDER_IS_PROCESSING);
    }

    private void doneOrder(Pizza pizza) {
        pizza.setOrderStatus(ORDER_IS_DONE);
    }

    public Queue<Pizza> getPizzasToBakeQueue() {
        return queueOfPizzasToBake;
    }

    public int getQueueCount() {
        return queueOfPizzasToBake.size();
    }
}