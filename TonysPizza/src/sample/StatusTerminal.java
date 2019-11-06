package sample;

import javafx.collections.ObservableList;

import java.util.ArrayList;

public class StatusTerminal {

    private ArrayList pizzaQueue;

    public StatusTerminal() {
        pizzaQueue = new ArrayList();
    }

    public void updatePizzaQueue(ArrayList updatedPizzaQueue) {
        pizzaQueue = updatedPizzaQueue;
    }

    public ArrayList getPizzaQueue() {
        return pizzaQueue;
    }
}
