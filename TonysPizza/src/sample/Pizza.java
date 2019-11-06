package sample;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Pizza {

    private final String name;
    private final double price;
    private final ArrayList<Ingredient> includedIngredients;
    private ArrayList<Ingredient> extraIngredients;
    private int orderStatus;
    private int orderNumber;

    public Pizza(String name, double price, ArrayList<Ingredient> includedIngredients) {
        this.name = name;
        this.price = price;
        this.includedIngredients = new ArrayList<>(includedIngredients);
        this.extraIngredients = new ArrayList<>();
        this.orderStatus = 0;
    }

    public void addExtraIngredient(Ingredient extraIngredient) {
        extraIngredients.add(extraIngredient);

    }

    public boolean removeIngredient(Ingredient ingredientToRemove) {
        // Tested
        for (Ingredient ingredient : includedIngredients) {
            if(ingredient.getName().equals(ingredientToRemove.getName())) {
                includedIngredients.remove(ingredient);
                return true;
            }
        }

        for (Ingredient ingredient : extraIngredients) {
            if(ingredient.getName().equals(ingredientToRemove.getName())) {
                extraIngredients.remove(ingredient);
                return true;
            }
        }

        return false;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Ingredient> getIncludedIngredients() {
        return includedIngredients;
    }

    public ArrayList<Ingredient> getExtraIngredients() {
        return extraIngredients;
    }
}
