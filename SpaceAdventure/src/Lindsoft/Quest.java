package Lindsoft;

public class Quest {

    private int questNumber;
    private String name;
    private String questDescription;
    private int positionX;
    private int positionY;
    private boolean isComplete;

    public Quest(int questNumber, int positionX, int positionY,  String name, String questDescription) {
        this.name = name;
        this.questDescription = questDescription;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isComplete = false;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getName() {
        return name;
    }

    public String getQuestDescription() {
        return questDescription;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isComplete() {
        return isComplete;
    }

    @Override
    public String toString() {
        return "Quest number: " + questNumber + "\n" + "Quest name: " + name + "\n" + "Description: " + questDescription
                + "\n" + "Position: " + positionX + ", " + positionY;
    }
}
