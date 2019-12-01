package Lindsoft;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class QuestHandler {

   private List<Quest> allQuests;

    public QuestHandler() {
        allQuests = new ArrayList<>();
        readInQuests();
    }

    private void readInQuests() {
        // Consider splitting try block and loop into two different methods for readability.

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\Lindsoft\\resources\\quests.txt"))) {

            String questToAdd;
            while(((questToAdd = reader.readLine()) != null)) {
                String[] arrayOfQuest = questToAdd.split(":");
                int questNumber = Integer.parseInt(arrayOfQuest[0]);
                int positionX = Integer.parseInt(arrayOfQuest[1]);
                int positionY = Integer.parseInt(arrayOfQuest[2]);
                String questName = arrayOfQuest[3];
                String questDescription = arrayOfQuest[4];
                allQuests.add(new Quest(questNumber, positionX, positionY, questName, questDescription));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Quest> getAllQuests() {
        return allQuests;
    }

}
