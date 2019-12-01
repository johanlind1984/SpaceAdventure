package Lindsoft;

public class StatItem extends Item {

    private String name;
    private int hitPoints;
    private int moveSpeed;
    private double fireRate;
    private boolean isStatSetToPlayer;

    public StatItem(String name, int hitPoints, int moveSpeed, double fireRate) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.moveSpeed = moveSpeed;
        this.fireRate = fireRate;
        this.isStatSetToPlayer = false;
    }

    public void setStatSetToPlayer(boolean statSetToPlayer) {
        isStatSetToPlayer = statSetToPlayer;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public double getFireRate() {
        return fireRate;
    }

    public boolean isStatSetToPlayer() {
        return isStatSetToPlayer;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Stats: \n" + "hp: " + hitPoints + " movespeed: " + moveSpeed + " firerate: " + fireRate + "\n\n";
    }
}
