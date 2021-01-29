
public class Finalkw {
    private int sum = 0;
    private final int NUMBER;

    public Finalkw(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("sum = %d\n", sum);
    }
}
