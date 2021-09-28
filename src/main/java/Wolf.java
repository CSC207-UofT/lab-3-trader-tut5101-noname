public class Wolf implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;

    /** Creates a wolf with a max speed of 31
     *
     */
    public Wolf() {
        this.maxSpeed = 31;
    }
    /** Increases speed by 1
     *
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 1;
    }
    /** Decreases speed by 1
     *
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 1;
    }
    /** Returns the speed of the care
     * @return The speed of the car
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /** Returns the sound a wolf makes
     * @return The sound a wolf makes
     */
    @Override
    public String sound() {
        return "GRRRRRR";
    }
    /** Returns the price of the wolf relative to its speed
     * @return The price of the wolf
     */
    @Override
    public int getPrice() {
        return this.maxSpeed * 100;
    }
}
