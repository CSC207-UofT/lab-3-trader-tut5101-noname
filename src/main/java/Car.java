public class Car implements Tradable, Drivable{
    private int speed;
    private final int PRICE;

    /** Creates a car
     *
     * @param speed the speed of the car
     * @param price the price of the car
     */
    public Car( int speed, int price){
        this.speed = speed;
        this.PRICE = price;
    }

    /** Increases speed by 1
     *
     */
    @Override
    public void upgradeSpeed() {
        this.speed++;
    }

    /** Decreases speed by 1
     *
     */
    @Override
    public void downgradeSpeed() {
        this.speed--;
    }

    /** Returns the speed of the car
     *
     * @return the speed of the car
     */
    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    /** Returns the price of the car
     *
     * @return the price
     */
    @Override
    public int getPrice() {
        return this.PRICE;
    }
}
