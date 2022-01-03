import java.util.Random;

/**
 * Makes a dice object that produces a random integer within 1-6
 */
public class Die {

    Random random = new Random();
    private final int MAXVALUE;

    public Die(int qty) {
        MAXVALUE = qty * 6;
    }

    public int getFacevalue() {
        return random.nextInt(MAXVALUE) + 1;
    }
}
