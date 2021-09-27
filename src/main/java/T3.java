/**
 * A public class that represents a Tesla Model 3 and implements the Drivable and Tradable class.
 */
public class T3 implements Drivable, Tradable{
    private int s;

    public T3(){
        this.s = 100;
    }

    @Override
    public void upgradeSpeed() {
        this.s += 5;

    }

    @Override
    public void downgradeSpeed() {
        this.s--;

    }

    @Override
    public int getMaxSpeed() {
        return s;
    }

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
