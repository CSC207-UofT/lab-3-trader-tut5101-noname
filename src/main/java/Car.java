public class Car implements Tradable, Drivable{
    private int speed;
    private final int price;

    /** creates a car
     *
     * @param speed the speed of the car
     * @param price the price of the car
     */
    public Car( int speed, int price){
        this.speed = speed;
        this.price = price;
    }

    /** increases speed by 1
     *
     */
    @Override
    public void upgradeSpeed() {
        this.speed++;
    }

    /** decreases speed by 1
     *
     */
    @Override
    public void downgradeSpeed() {
        this.speed--;
    }

    /** returns the speed of the car
     *
     * @return the speed of the car
     */
    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    /** returns the price of the car
     *
     * @return the price
     */
    @Override
    public int getPrice() {
        return price;
    }
}
