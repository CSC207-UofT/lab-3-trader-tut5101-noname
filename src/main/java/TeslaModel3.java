/**
 * A public class that represents a Tesla Model 3 and implements the Drivable and Tradable class.
 */
public class TeslaModel3 implements Drivable, Tradable{
    private int speed;

    /**
     * Construct a T3, giving it a speed value of 100.
     */
    public TeslaModel3(){
        this.speed = 100;
    }


    /**
     * Add 5 to the speed instance variable.
     */
    @Override
    public void upgradeSpeed() {
        this.speed += 5;

    }

    /**
     * Decrease the speed variable by 1
     */
    @Override
    public void downgradeSpeed() {
        this.speed--;

    }

    /**
     * Return the max speed value.s
     * @return the speed value
     */
    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    /**
     * Return the price of the vehicle.
     * @return the price of the Tesla Model 3
     */
    @Override
    public int getPrice() {
        return 45000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.speed +")";
    }
}
