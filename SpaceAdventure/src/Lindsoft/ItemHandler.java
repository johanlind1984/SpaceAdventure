package Lindsoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemHandler {

    private List<Item> allItems;
    private Random randomItemPosition;

    public ItemHandler() {
        randomItemPosition = new Random();
        allItems = new ArrayList<>();
        createStatItems();
        createShotItems();
    }

    public List<Item> getAllItems() {
        return allItems;
    }

    public Item getRandomItem() {
        return allItems.get(randomItemPosition.nextInt((allItems.size()-1) + 1));
    }

    private void createShotItems() {
    }

    private void createStatItems() {
        try (BufferedReader reader = new BufferedReader(new FileReader("SpaceAdventure\\src\\Lindsoft\\resources\\statitems.txt"))) {

            String statItemToAdd;
            while(((statItemToAdd = reader.readLine()) != null)) {
                String[] arrayOfStatitem = statItemToAdd.split(":");
                String itemName = arrayOfStatitem[0];
                int hp = Integer.parseInt(arrayOfStatitem[1]);
                int moveSpeed = Integer.parseInt(arrayOfStatitem[2]);
                double fireRate = Double.parseDouble(arrayOfStatitem[3]);
                allItems.add(new StatItem(itemName, hp, moveSpeed, fireRate));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
