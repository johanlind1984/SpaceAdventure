package Lindsoft;

public class Enemy {

    // Base attriutes
    private String name; // name of enemy
    private int hitPoints; // hitpoints
    private int moveSpeed; // movementspeed

    // Shot attributes
    private double accuracy; // accoracy of shots
    private double shotSpeed; // how fast the bullet travels
    private double fireRate; // how many shots fired per second.
    private int shotType; // single, double, trippe shot etc.
    private String shotElement; // Shotelement: bomb, laser, bullet, nuke, energyweapon, plasma etc.

    public Enemy(String name, int hitPoints, int moveSpeed, double accuracy, double shotSpeed, double fireRate, int shotType, String shotElement) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.moveSpeed = moveSpeed;
        this.accuracy = accuracy;
        this.shotSpeed = shotSpeed;
        this.fireRate = fireRate;
        this.shotType = shotType;
        this.shotElement = shotElement;
    }
    //    abstract void move() {}
//    abstract void destroy();
    public void shoot() {
        System.out.println("Fired " + shotType + " " + shotElement + " at a speed of " + shotSpeed + "pixels per ms, with a " + accuracy*100 + "% chance to hit. next shot will be fired in " + fireRate + " seconds");
    }

    public void move() {}
    public void destroy() {}
//    abstract void tatget();
//    abstract void findPlayer();
//    abstract void targetPlayer();

}
