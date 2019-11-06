package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tony Mozarellas OrderSystem");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        ChefTerminal chef1Terminal = new ChefTerminal("Chef1");
        ChefTerminal chef2Terminal = new ChefTerminal("Chef2");
        ChefTerminal chef3Terminal = new ChefTerminal("Chef3");
        ChefTerminal chef4Terminal = new ChefTerminal("Chef4");

        Ingredient ham = new Ingredient("Ham", 0.99);
        Ingredient cheese = new Ingredient("Cheese", 1.99);
        Ingredient tomatosauce = new Ingredient("Tomato Sauce", 0.25);
        Ingredient olives = new Ingredient("Olives", 0.99);
        Ingredient peppers = new Ingredient("Peppers", 0.75);
        Ingredient salami = new Ingredient("Salami", 1.25);
        Ingredient mushrooms = new Ingredient("Mushroom", 0.75);
        Ingredient shrimp = new Ingredient("Shrimp", 2.0);

        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ArrayList<Ingredient> extraIngredients = new ArrayList<>();

        ingredients.add(tomatosauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        Pizza vesuvio = new Pizza("Vesuvio", 7.50, ingredients);
        ingredients.clear();

        ingredients.add(tomatosauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(mushrooms);
        Pizza cappriciosa = new Pizza("Cappriciosa", 8.00, ingredients);
        ingredients.clear();

        ingredients.add(tomatosauce);
        ingredients.add(cheese);
        ingredients.add(shrimp);
        Pizza bussola = new Pizza("Bussola", 8.00, ingredients);
        ingredients.clear();

        ingredients.add(tomatosauce);
        ingredients.add(cheese);
        ingredients.add(olives);
        Pizza olivia = new Pizza("Olivia", 7.50, ingredients);
        CustomerTerminal terminal1 = new CustomerTerminal();

        terminal1.addPizzaToShoppingCart(bussola);
        cappriciosa.addExtraIngredient(olives);
        cappriciosa.addExtraIngredient(shrimp);
        terminal1.addPizzaToShoppingCart(cappriciosa);
        terminal1.removeIngredientFromPizza(olives,cappriciosa);
        terminal1.addPizzaToShoppingCart(cappriciosa);
        cappriciosa.removeIngredient(mushrooms);
        terminal1.addPizzaToShoppingCart(cappriciosa);
        cappriciosa.addExtraIngredient(mushrooms);
        terminal1.addPizzaToShoppingCart(cappriciosa);


        ArrayList pizzas = terminal1.getPizzaInCart();

        for (int i = 0; i < pizzas.size(); i++) {
            Pizza tempPizza = (Pizza) pizzas.get(i);
            System.out.println(tempPizza.getName() + " ===================");
            for (Ingredient included : tempPizza.getIncludedIngredients()) {
                System.out.println(included.getName());
            }
            for (Ingredient extra : tempPizza.getExtraIngredients()) {
                System.out.println(extra.getName());
            }



        }

        // launch(args);
    }
}
