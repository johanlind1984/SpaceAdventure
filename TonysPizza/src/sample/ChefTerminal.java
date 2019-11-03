package sample;

import java.util.LinkedList;
import java.util.Queue;

public class ChefTerminal {

    String name;
    private Queue<Pizza> queueOfPizzasToBake;

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

    public Queue<Pizza> getPizzasToBakeQueue() {
        return queueOfPizzasToBake;
    }

    public int getQueueCount() {
        return queueOfPizzasToBake.size();
    }
}