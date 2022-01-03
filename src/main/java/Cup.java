/**
 * Cup rolls dices. Create 2 dies as default upon initialization
 */
public class Cup {

    private int sum;
    Die die;

    public Cup() {
        Die die = new Die(2);
    }

    public int getSum() {
        return sum;
    }

    public void roll() {
        sum = die.getFacevalue();
    }
}
