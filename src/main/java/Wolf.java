public class Wolf implements Drivable, Domesticatable, Tradable{
    private int maxSpeed =31; //average land speed of wolf in miles per hour
    @Override
    public void upgradeSpeed() {
        //Is your wolf a better wolf than the average wolf? Then this method is for you!
        this.maxSpeed += 1;
    }

    @Override
    public void downgradeSpeed() {
        //Is your wolf a little slow? Maybe they just don't like running? Well in that case, downgrade your wolf today!
        this.maxSpeed -= 1;
    }

    @Override
    public int getMaxSpeed() {
        //Need to know your wolf's top speed? Well here you go!
        return this.maxSpeed;
    }

    @Override
    public String sound() {
        //A wolf makes this sound
        return "GRRRRRR";
    }

    @Override
    public int getPrice() {
        return this.maxSpeed * 100;
        //Wolves are worth their speed multiplied by 100. It is objective science don't ask me why
    }
}
