package sample;

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
        Pizza bussola = new Pizza("Cappriciosa", 8.00, ingredients);
        ingredients.clear();

        ingredients.add(tomatosauce);
        ingredients.add(cheese);
        ingredients.add(olives);
        Pizza olivia = new Pizza("Olivia", 7.50, ingredients);
        ingredients.clear();


        // launch(args);
    }
}
