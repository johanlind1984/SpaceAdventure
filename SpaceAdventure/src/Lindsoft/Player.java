package Lindsoft;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int hitPoints;
    private double moveSpeed;
    private double fireRate;
    List<Item> inventory;

    // Shot attributes
    private double accuracy; // accoracy of shots
    private double shotSpeed; // how fast the bullet travels
    private int shotType; // single, double, trippe shot etc.
    private String shotElement; // Shotelement: bomb, laser, bullet, nuke, energyweapon, plasma etc.

    public Player(String name) {
        this.name = name;
        hitPoints = 100;
        moveSpeed = 1.0;
        fireRate = 10;
        accuracy = 50;
        shotSpeed = 1;
        shotType = 0;
        shotElement = "";
        inventory = new ArrayList<>();
    }

    public void move() {}
    public void destroy() {}
    public void shoot() {}
    public void pickupStatItem(StatItem itemToPickUp) {
        StatItem deepCopyOfITemToPickUp = (StatItem) deepCopy(itemToPickUp);
        addStatItemToPlayerStats(deepCopyOfITemToPickUp);
        inventory.add(deepCopyOfITemToPickUp);
    }

    private void addStatItemToPlayerStats(StatItem itemToAdd){
        hitPoints += itemToAdd.getHitPoints();
        moveSpeed += itemToAdd.getMoveSpeed();
        fireRate += itemToAdd.getFireRate();
    }

    private StatItem deepCopy(StatItem statItemToCopy) {
        StatItem deepCopy = new StatItem(statItemToCopy.getName(), statItemToCopy.getHitPoints(), statItemToCopy.getMoveSpeed(), statItemToCopy.getFireRate());
        System.out.println();
        return deepCopy;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public double getFireRate() {
        return fireRate;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public double getShotSpeed() {
        return shotSpeed;
    }

    public int getShotType() {
        return shotType;
    }

    public String getShotElement() {
        return shotElement;
    }
}
