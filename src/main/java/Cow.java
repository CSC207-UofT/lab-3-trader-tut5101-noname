/**
 * The COW is a noble animal.
 * Cows are nice. I like cows because they are a funny animal.
 * Cows live on farms and they make milk for farmers. I like to drink milk.
 */
public class Cow implements Domesticatable, Tradable {

    private int size;

    public Cow() {
        this.size = 3;
    }

    public Cow(int size) {
        this.size = size;
    }

    /**
     * Return the sound of the cow.
     *
     * @return  The sound of the cow.
     */
    @Override
    public String sound() {
        return "Moo!";
    }

    @Override
    public int getPrice() { return size * 3; }

    /**
     * Return the size of the cow.
     *
     * @return  The size of the cow.
     */
    public int getSize() { return size; }

    /**
     * Feed the cow a fixed amount of feed, increasing its size.
     * Cows cannot have more than 10 size. Feeding will fail if the cow
     * will exceed its maximum size.
     *
     * @return  Return true if feeding is successful, or false if it fails.
     */
    public boolean feed() {
        // Check if feeding is allowed
        if (this.size == 10)
            return false;

        this.size += 1;
        return true;
    }

    /**
     * Feed the cow a fixed amount of feed, increasing its size.
     * Cows cannot have less than 1 size. Starving will fail if the cow
     * will exceed its minimum size.
     *
     * @return  Return true if starving is successful, or false if it fails.
     */
    public boolean starve() {
        // Check if starving is allowed
        if (this.size == 1)
            return false;

        this.size -= 1;
        return true;
    }

}
