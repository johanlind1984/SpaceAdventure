package sample;

import java.util.ArrayList;

public class Menu {
    // READ in ingredients from database and compose preset pizzas (either from another database or in class) in a list
    ArrayList<Ingredient> ingredients;
    ArrayList<Pizza> pizzas;

    public Menu() {
        ingredients = new ArrayList<>();
        pizzas = new ArrayList<>();
        ingredientsReadFromDatabaseToList();
        pizzasReadFromDatabaseToList();
    }

    private void ingredientsReadFromDatabaseToList() {

        Ingredient ham = new Ingredient("Ham", 0.4);
        Ingredient cheese = new Ingredient("Cheese", 0.4);
        Ingredient tomato = new Ingredient("Tomato", 0.4);

        ArrayList<Ingredient> tempIngredient = new ArrayList<>();
        tempIngredient.add(ham);
        tempIngredient.add(cheese);
        tempIngredient.add(tomato);


        Pizza vesuvio = new Pizza("Vesuvio", 7, tempIngredient);
        pizzas.add(vesuvio);




    }

    private void pizzasReadFromDatabaseToList() {

    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }
}
