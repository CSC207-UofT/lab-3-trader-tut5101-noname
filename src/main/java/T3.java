/**
 * A public class that represents a Tesla Model 3 and implements the Drivable and Tradable class.
 */
public class T3 implements Drivable, Tradable{
    private int s;

    /**
     * Construct a T3, giving it a speed value of 100.
     */
    public T3(){
        this.s = 100;
    }


    /**
     * Add 5 to the speed instance variable.
     */
    @Override
    public void upgradeSpeed() {
        this.s += 5;

    }

    /**
     * Decrease the speed variable by 1
     */
    @Override
    public void downgradeSpeed() {
        this.s--;

    }

    /**
     * Return the max speed value.
     * @return the speed value
     */
    @Override
    public int getMaxSpeed() {
        return this.s;
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
        return id + " (Max speed: " + this.s +")";
    }
}
