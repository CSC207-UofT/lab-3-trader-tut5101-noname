public class Elephant implements Drivable, Domesticatable, Tradable {
    private int Speed;

    public Elephant() {
        this.Speed = 5;
    }

    @Override
    public String sound() {
        return "Bahruuhhaa!";
    }

    @Override
    public void upgradeSpeed() {
        this.Speed++

    }

    @Override
    public void downgradeSpeed() {
        this.Speed--;

    }

    @Override
    public int getMaxSpeed() {
        return this.Speed;
    }

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (speed: " + this.Speed + ")";
    }
}