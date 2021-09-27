public class Mule implements Domesticatable, Drivable, Tradable {
    private int maxSpeed;

    public Mule() {
        this.maxSpeedo = 420;
    }

    @Override
    public String sound() {
        return "MOOOO!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 69;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
