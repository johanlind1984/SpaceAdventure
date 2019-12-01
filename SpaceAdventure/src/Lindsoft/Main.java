package Lindsoft;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EnemyBanger banger1 = new EnemyBanger();
        Player player1 = new Player("Player");
        ItemHandler itemHandler = new ItemHandler();
        QuestHandler questHandler = new QuestHandler();

        List allItems = new ArrayList<>(itemHandler.getAllItems());

        for (int i = 0; i < allItems.size(); i++) {
            System.out.println(allItems.get(i).toString());
        }


    }
}
